package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.Connexion;
import dao.IDAO;
import entities.Client;
import entities.Reservation;

public class ClientService implements IDAO<Client> {

    @Override
    public boolean create(Client o) {
        String req = "INSERT INTO Client (CIN, N_Complet, telephone, email) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
            ps.setString(1, o.getCIN());
            ps.setString(2, o.getN_Complet());
            ps.setString(3, o.getTelephone());
            ps.setString(4, o.getEmail());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
@Override
public Client findById(int id) {
    String req = "SELECT * FROM Client WHERE id = ?";
    Client client = null;  // Declare the client object outside of the try-catch block

    try {
        PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
        ps.setInt(1, id);  // Corrected to set an integer for the ID
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            client = new Client(
                rs.getInt("id"),
                rs.getString("CIN"),
                rs.getString("N_Complet"),
                rs.getString("telephone"),
                rs.getString("email"),
                rs.getTimestamp("created_at")
            );
        }

    } catch (SQLException e) {
        System.out.println("Error in findById: " + e.getMessage());
    }

    return client;  // Return the client object, even if it's null if no result is found
}

    @Override
    public boolean update(Client o) {
        String req = "UPDATE Client SET CIN = ?, N_Complet = ?, telephone = ?, email = ? WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
            ps.setString(1, o.getCIN());
            ps.setString(2, o.getN_Complet());
            ps.setString(3, o.getTelephone());
            ps.setString(4, o.getEmail());
            ps.setInt(5, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Client o) {
        String req = "DELETE FROM Client WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
            ps.setInt(1, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

 public List<Client> findByCIN(String cin) {
    String req = "SELECT * FROM Client WHERE CIN = ?";
    List<Client> clients = new ArrayList<>();  // Initialize a list to hold the results

    try {
        PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
        ps.setString(1, cin);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {  // Loop through all the rows in the result set
            Client client = new Client(
                rs.getInt("id"),
                rs.getString("CIN"),
                rs.getString("N_Complet"),
                rs.getString("telephone"),
                rs.getString("email"),
                rs.getTimestamp("created_at")
            );
            clients.add(client);  // Add the client to the list
        }

    } catch (SQLException e) {
        System.out.println("Error in findByCIN: " + e.getMessage());
    }

    return clients;  // Return the list of clients
}

    @Override
    public List<Client> findAll() {
        String req = "SELECT * FROM Client";
        List<Client> clients = new ArrayList<>();
        try {
            PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                clients.add(new Client(
                    rs.getInt("id"), 
                    rs.getString("CIN"), 
                    rs.getString("N_Complet"),
                    rs.getString("telephone"), 
                    rs.getString("email"), 
                    rs.getTimestamp("created_at")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error in findAll: " + e.getMessage());
        }
        return clients;
    }
public int countTotalClients() {
    String query = "SELECT COUNT(*) AS total FROM Client";
    int totalClients = 0;

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(query);
         ResultSet rs = ps.executeQuery()) {

        if (rs.next()) {
            totalClients = rs.getInt("total");
        }
    } catch (SQLException e) {
        System.out.println("Error while counting total clients: " + e.getMessage());
    }

    return totalClients;
}
public List<Integer> getAllClientIds() {
    String query = "SELECT id FROM Client";
    List<Integer> clientIds = new ArrayList<>();

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(query);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            clientIds.add(rs.getInt("id"));
        }
    } catch (SQLException e) {
        System.out.println("Error while retrieving client IDs: " + e.getMessage());
    }

    return clientIds;
}
public List<String> getAllClientCINs() {
    String query = "SELECT CIN FROM Client";
    List<String> clientCINs = new ArrayList<>();

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(query);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            clientCINs.add(rs.getString("CIN"));
        }
    } catch (SQLException e) {
        System.out.println("Error while retrieving client CINs: " + e.getMessage());
    }

    return clientCINs;
}

}
