package Service;

import java.sql.*;
import java.util.*;
import java.util.Date;
import Connection.Connexion;
import dao.IDAO;
import entities.Reservation;

public class ReservationService implements IDAO<Reservation> {

    @Override
public boolean create(Reservation reservation) {
    // Check if the chambre is already reserved for the specified dates
    if (isChambreReserved(reservation.getN_chambre(), reservation.getDatedebut(), reservation.getDatefin())) {
        System.out.println("The chambre is already reserved for the specified dates.");
        return false; // Return false if the chambre is not available
    }

    String req = "INSERT INTO Reservation (datedebut, datefin, CIN_client, N_chambre, status, prix) VALUES (?, ?, ?, ?, ?, ?)";
    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
        // Set reservation details
        ps.setDate(1, new java.sql.Date(reservation.getDatedebut().getTime()));
        ps.setDate(2, new java.sql.Date(reservation.getDatefin().getTime()));
        ps.setString(3, reservation.getCIN_client());
        ps.setInt(4, reservation.getN_chambre());
        ps.setString(5, "en cours"); // Default status is 'en cours'
        ps.setDouble(6, calculatePrice(reservation));

        // Execute the query
        return ps.executeUpdate() == 1;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
private boolean isChambreReserved(int chambreNumero, Date startDate, Date endDate) {
    String req = "SELECT * FROM Reservation WHERE N_chambre = ? AND status IN ('en cours', 'confirmée') AND " +
                 "((datedebut <= ? AND datefin >= ?) OR (datedebut <= ? AND datefin >= ?) OR " +
                 "(datedebut >= ? AND datefin <= ?))";
    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
        ps.setInt(1, chambreNumero);
        ps.setDate(2, new java.sql.Date(endDate.getTime()));
        ps.setDate(3, new java.sql.Date(startDate.getTime()));
        ps.setDate(4, new java.sql.Date(endDate.getTime()));
        ps.setDate(5, new java.sql.Date(startDate.getTime()));
        ps.setDate(6, new java.sql.Date(startDate.getTime()));
        ps.setDate(7, new java.sql.Date(endDate.getTime()));

        ResultSet rs = ps.executeQuery();
        return rs.next(); // Return true if there is an overlapping reservation
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

    @Override
    public boolean update(Reservation reservation) {
        String req = "UPDATE Reservation SET datedebut = ?, datefin = ?, CIN_client = ?, N_chambre = ?, status = ?, prix = ? WHERE id = ?";
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            // Set reservation details
            ps.setDate(1, new java.sql.Date(reservation.getDatedebut().getTime()));
            ps.setDate(2, new java.sql.Date(reservation.getDatefin().getTime()));
            ps.setString(3, reservation.getCIN_client());
            ps.setInt(4, reservation.getN_chambre());
            ps.setString(5, reservation.getStatus());
            ps.setDouble(6, calculatePrice(reservation));
            ps.setInt(7, reservation.getId());

            // Execute the update
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Reservation reservation) {
        String req = "DELETE FROM Reservation WHERE id = ?";
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            ps.setInt(1, reservation.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Reservation> findById2(int id) {
    List<Reservation> reservations = new ArrayList<>();
    String req = "SELECT * FROM Reservation WHERE id = ?";
    
    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
        ps.setInt(1, id);  // Bind the id parameter

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            // Create Reservation objects from result set
            Reservation reservation = new Reservation(
                rs.getInt("id"),
                rs.getDate("datedebut"),
                rs.getDate("datefin"),
                rs.getString("CIN_client"),
                rs.getInt("N_chambre"),
                rs.getString("status"),
                rs.getDouble("prix")
            );
            reservations.add(reservation);  // Add reservation to list
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return reservations;  // Return the list of reservations
}

    @Override
    public Reservation findById(int id) {
        String req = "SELECT * FROM Reservation WHERE id = ?";
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Reservation(
                    rs.getInt("id"),
                    rs.getDate("datedebut"),
                    rs.getDate("datefin"),
                    rs.getString("CIN_client"),
                    rs.getInt("N_chambre"),
                    rs.getString("status"),
                    rs.getDouble("prix")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Reservation> findAll() {
        String req = "SELECT * FROM Reservation";
        List<Reservation> reservations = new ArrayList<>();
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Reservation reservation = new Reservation(
                    rs.getInt("id"),
                    rs.getDate("datedebut"),
                    rs.getDate("datefin"),
                    rs.getString("CIN_client"),
                    rs.getInt("N_chambre"),
                    rs.getString("status"),
                    rs.getDouble("prix")
                );
                reservations.add(reservation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservations;
    }

    // Confirm reservation (change status to 'confirmée')
    public boolean confirm(int reservationId) {
        String req = "UPDATE Reservation SET status = 'confirmée' WHERE id = ?";
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            ps.setInt(1, reservationId);
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Cancel reservation (set status to 'annulée') and free the chambre
    public boolean cancel(int reservationId) {
        String req = "UPDATE Reservation SET status = 'annulée' WHERE id = ?";
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            ps.setInt(1, reservationId);
            if (ps.executeUpdate() == 1) {
                // Free the concerned chambre (set availability to 'oui')
                Reservation reservation = findById(reservationId);
              
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
// Helper method to calculate the price of a reservation
public double calculatePrice(Reservation reservation) {
    double chambrePrice = getCatPrix(reservation.getN_chambre()); 
    if (chambrePrice != -1) {
        long diffInMillies = reservation.getDatefin().getTime() - reservation.getDatedebut().getTime();
        
        // Ensure that the dates are valid and calculate the number of days
        if (diffInMillies <= 0) {
            System.out.println("Invalid dates: end date must be after start date.");
            return 0; // Invalid date range
        }

        long diffInDays = (diffInMillies / (24 * 60 * 60 * 1000)); // Convert milliseconds to days
        return chambrePrice * (diffInDays + 1 );
    }

    System.out.println("Chambre price not found.");
    return 0; // Return 0 if the room price cannot be determined
}

// Get the category libelle based on the room number
public String getCategorie(int numChambre) {
    String libelle = "";
    String req = "SELECT categorie FROM chambre WHERE numero = ?";
    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
        ps.setInt(1, numChambre);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            libelle = rs.getString("categorie");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return libelle;
}
// Get the price of a category based on the room number
public double getCatPrix(int numChambre) {
    String libelle = getCategorie(numChambre); // Fetch the category libelle
    if (!libelle.isEmpty()) {
        String req = "SELECT prix FROM categorie WHERE libelle = ?";
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            ps.setString(1, libelle);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getDouble("prix");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return -1; // Return -1 if no price is found or if libelle is empty
}

    public int countTotalReservations() {
    String req = "SELECT COUNT(*) AS total FROM Reservation";
    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
         ResultSet rs = ps.executeQuery()) {
        if (rs.next()) {
            return rs.getInt("total");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0; // Return 0 if there are no reservations or an error occurs
}
public List<Reservation> findReservationsByCINAndDateRange(String cinClient, Date datedebut, Date datefin) {
    List<Reservation> reservations = new ArrayList<>();
    String query = "SELECT * FROM Reservation WHERE CIN_client = ? AND datedebut >= ? AND datefin <= ?";

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(query)) {
        ps.setString(1, cinClient); // Set the CIN_client parameter
        ps.setDate(2, new java.sql.Date(datedebut.getTime())); 
        ps.setDate(3, new java.sql.Date(datefin.getTime())); 

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Reservation reservation = new Reservation(
                rs.getInt("id"),
                rs.getDate("datedebut"),
                rs.getDate("datefin"),
                rs.getString("CIN_client"),
                rs.getInt("N_chambre"),
                rs.getString("status"),
                rs.getDouble("prix")
            );
            reservations.add(reservation);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return reservations; 
}

}
