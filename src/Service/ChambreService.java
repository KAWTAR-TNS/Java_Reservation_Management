package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.Connexion;
import dao.IDAO;
import entities.Chambre;

public class ChambreService implements IDAO<Chambre> {

	@Override
	public boolean create(Chambre o) {
	    String req = "INSERT INTO Chambre (numero, telephone, categorie) VALUES (?, ?, ?)";
	    try {
	        PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
	        ps.setInt(1, o.getNumero());
	        ps.setString(2, o.getTelephone());
	        ps.setString(3, o.getCategorie());
	        return ps.executeUpdate() == 1;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	@Override
public boolean update(Chambre chambre) {
    String req = "UPDATE Chambre SET numero = ?, telephone = ?, categorie = ? WHERE id = ?";
    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
        ps.setInt(1, chambre.getNumero());
        ps.setString(2, chambre.getTelephone());
        ps.setString(3, chambre.getCategorie());  // Ensure this matches the column type
        ps.setInt(4, chambre.getId());
        int rowsUpdated = ps.executeUpdate();
        return rowsUpdated > 0; // If rows were updated, return true
    } catch (SQLException e) {
        System.out.println("Error updating chambre: " + e.getMessage());
        return false;
    }
}

	@Override
	public boolean delete(Chambre o) {
	    String req = "DELETE FROM Chambre WHERE id = ?";
	    try {
	        PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
	        ps.setInt(1, o.getId());
	        return ps.executeUpdate() == 1;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	public double ChambrePrice(String categorieLibelle) {
	    String req = "SELECT cat.prix FROM Categorie cat WHERE cat.libelle = ?";
	    try {
	        PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
	        ps.setString(1, categorieLibelle);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            return rs.getDouble("prix");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return -1;  // Return -1 if not found or error occurred
	}

	@Override
public Chambre findById(int chambreId) {
    String req = "SELECT id, numero, telephone, categorie FROM chambre WHERE id = ?";
    Chambre chambre = null;

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
        ps.setInt(1, chambreId);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            chambre = new Chambre(
                rs.getInt("id"),
                rs.getInt("numero"),
                rs.getString("telephone"),
                rs.getString("categorie")
            );
        }
    } catch (SQLException e) {
        System.out.println("Error in findById: " + e.getMessage());
    }

    return chambre;
}
public List<Integer> getAllChambreNumbers() {
    List<Integer> chambreNumbers = new ArrayList<>();
    String req = "SELECT numero FROM Chambre"; // Assuming 'numero' is the column name for the room number
    
    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
         ResultSet rs = ps.executeQuery()) {
        
        while (rs.next()) {
            chambreNumbers.add(rs.getInt("numero"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return chambreNumbers;
}

public List<Chambre> getChambresByCategorieLibelle(String categorieLibelle) {
    String req = "SELECT c.id, c.numero, c.telephone, c.categorie "
               + "FROM Chambre c "
               + "WHERE c.categorie = ?";
    
    List<Chambre> chambresList = new ArrayList<>();
    
    try {
        PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
        ps.setString(1, categorieLibelle);  // Ensure you pass the correct category name
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Chambre chambre = new Chambre(
                rs.getInt("id"),
                rs.getInt("numero"),
                rs.getString("telephone"),
                rs.getString("categorie")
            );
            chambresList.add(chambre);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return chambresList;
}

@Override
public List<Chambre> findAll() {
    String req = "SELECT id, numero, telephone, categorie FROM chambre";
    List<Chambre> list = new ArrayList<>();
    try {
        PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            // Ensure that the 'id' is properly assigned here
            Chambre chambre = new Chambre(rs.getInt("id"), rs.getInt("numero"), rs.getString("telephone"), rs.getString("categorie"));
            list.add(chambre);
        }
    } catch (SQLException e) {
        System.out.println("Error in findAll: " + e.getMessage());
    }
    return list;
}

        public int countTotalChambres() {
    String req = "SELECT COUNT(*) AS total FROM Chambre";
    int total = 0;

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
         ResultSet rs = ps.executeQuery()) {

        if (rs.next()) {
            total = rs.getInt("total");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return total;
}
public List<Chambre> findByNumero(int numero) {
    String req = "SELECT * from chambre WHERE numero = ?";
    List<Chambre> chambres = new ArrayList<>();

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
        ps.setInt(1, numero);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Chambre chambre = new Chambre(
                    rs.getInt("id"),
                rs.getInt("numero"),
                rs.getString("telephone"),
                rs.getString("categorie")
            );
            chambres.add(chambre);
        }
    } catch (SQLException e) {
        System.out.println("Error in findByNumero: " + e.getMessage());
    }

    return chambres; // Return the list of chambres, even if empty
}
public int countChambresByCategorie(String categorie) {
    String req = "SELECT COUNT(*) AS total FROM Chambre WHERE categorie = ?";
    int total = 0;

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
        ps.setString(1, categorie);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            total = rs.getInt("total");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return total;
}

}
