package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IDAO;
import entities.Categorie;
import Connection.Connexion;

public class CategorieService implements IDAO<Categorie> {
public List<String> getAllCategorieLibelles() {
    String req = "SELECT libelle FROM Categorie";
    List<String> libelles = new ArrayList<>();

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            libelles.add(rs.getString("libelle"));
        }
    } catch (SQLException e) {
        System.out.println("Error in getAllCategorieLibelles: " + e.getMessage());
    }

    return libelles; // Return the list of libelle
}

    @Override
    public boolean create(Categorie o) {
        String req = "INSERT INTO Categorie (id, libelle, prix) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
            ps.setInt(1, o.getId());
            ps.setString(2, o.getLibelle());
            ps.setDouble(3, o.getPrix());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
public List<Categorie> findByLibelle(String libelle) {
    List<Categorie> categories = new ArrayList<>(); // List to store categories
    String req = "SELECT * FROM Categorie WHERE libelle = ?";

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
        ps.setString(1, libelle);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            // Add each category to the list
            categories.add(new Categorie(
                rs.getInt("id"),        // Assuming the Categorie table has an id column
                rs.getString("libelle"),
                rs.getDouble("prix")    // Assuming the Categorie table has a prix column
            ));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return categories; // Return the list of categories (empty list if no results)
}

    @Override
    public boolean update(Categorie o) {
        String req = "UPDATE Categorie SET libelle = ?, prix = ? WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
            ps.setString(1, o.getLibelle());
            ps.setDouble(2, o.getPrix());
            ps.setInt(3, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Categorie o) {
        String req = "DELETE FROM Categorie WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
            ps.setInt(1, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Categorie findById(int id) {
        String req = "SELECT * FROM Categorie WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Categorie(
                    rs.getInt("id"),
                    rs.getString("libelle"),
                    rs.getDouble("prix")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
public List<String> findAllLibelles() {
    String req = "SELECT libelle FROM Categorie";
    List<String> libelles = new ArrayList<>();
    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
         ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            libelles.add(rs.getString("libelle"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return libelles;
}


    @Override
    public List<Categorie> findAll() {
        String req = "SELECT * FROM Categorie";
        List<Categorie> list = new ArrayList<>();
        try {
            PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Categorie(
                    rs.getInt("id"),
                    rs.getString("libelle"),
                    rs.getDouble("prix")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public int countTotalCategories() {
    String req = "SELECT COUNT(*) AS total FROM Categorie";
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

}
