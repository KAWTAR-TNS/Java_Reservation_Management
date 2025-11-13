package entities;
public class Chambre {
    private int id;
    private int numero;
    private String telephone;
    private String categorie;

    // Constructor
    public Chambre(int id, int numero, String telephone, String categorie) {
        this.id = id;
        this.numero = numero;
        this.telephone = telephone;
        this.categorie = categorie;
    }
   public Chambre(int numero, String telephone, String categorie) {
     
        this.numero = numero;
        this.telephone = telephone;
        this.categorie = categorie;
    }
    // Getters
    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getCategorie() {
        return categorie;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
