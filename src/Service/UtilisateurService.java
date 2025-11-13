package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IDAO;
import entities.Utilisateur;
import Connection.Connexion;

public class UtilisateurService implements IDAO<Utilisateur> {

    @Override
    public boolean create(Utilisateur o) {
        String req = "INSERT INTO Utilisateur ( username, password) VALUES ( ?, ?)";
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            ps.setString(1, o.getUsername());
            ps.setString(2, o.getPassword());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Utilisateur o) {
        String req = "UPDATE Utilisateur SET username = ?, password = ? WHERE id = ?";
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            ps.setString(1, o.getUsername());
            ps.setString(2, o.getPassword());
            ps.setInt(3, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Utilisateur o) {
        String req = "DELETE FROM Utilisateur WHERE id = ?";
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            ps.setInt(1, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Utilisateur findById(int id) {
        String req = "SELECT * FROM Utilisateur WHERE id = ?";
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Utilisateur(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Utilisateur> findById2(int id) {
    String req = "SELECT * FROM Utilisateur WHERE id = ?";
    List<Utilisateur> list = new ArrayList<>();

    try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            list.add(new Utilisateur(
                rs.getInt("id"),
                rs.getString("username"),
                rs.getString("password")
            ));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return list; // Return the list (empty if no users are found with the given id)
}


    @Override
    public List<Utilisateur> findAll() {
        String req = "SELECT * FROM Utilisateur";
        List<Utilisateur> list = new ArrayList<>();
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Utilisateur(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Utilisateur> findByUsername(String username) {
        String req = "SELECT * FROM Utilisateur WHERE username LIKE ?";
        List<Utilisateur> list = new ArrayList<>();
        try (PreparedStatement ps = Connexion.getCnx().prepareStatement(req)) {
            ps.setString(1, "%" + username + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Utilisateur(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
