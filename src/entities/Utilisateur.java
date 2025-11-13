package entities;

public class Utilisateur {
    private int id;
    private String Username;
    private String Password;

    // Constructors
    public Utilisateur(int id, String Username, String Password) {
        this.id = id;
        this.Username = Username;
        this.Password = Password;
    }

    public Utilisateur(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
