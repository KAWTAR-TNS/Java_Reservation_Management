package entities;

import java.util.Date;

public class Reservation {
    private int id;
    private Date datedebut;
    private Date datefin;
    private String CIN_client;
    private int N_chambre;
    private String status;
    private double prix;

    // Constructor
    public Reservation(int id, Date datedebut, Date datefin, String CIN_client, int N_chambre, String status) {
        this.id = id;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.CIN_client = CIN_client;
        this.N_chambre = N_chambre;
        setStatus(status);  // Use setter to ensure valid status
    }
    public Reservation(Date datedebut, Date datefin, String CIN_client, int N_chambre, String status) {
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.CIN_client = CIN_client;
        this.N_chambre = N_chambre;
        setStatus(status);  // Use setter to ensure valid status
    }
    public Reservation(int id, Date datedebut, Date datefin, String CIN_client, int N_chambre, String status , double prix) {
        this.id = id;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.CIN_client = CIN_client;
        this.N_chambre = N_chambre;
        setStatus(status);  // Use setter to ensure valid status
        this.prix=prix;
    }
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        if (datefin.after(datedebut)) {
            this.datefin = datefin;
        } else {
            throw new IllegalArgumentException("Datefin must be after Datedebut");
        }
    }

    public String getCIN_client() {
        return CIN_client;
    }

    public void setCIN_client(String CIN_client) {
        this.CIN_client = CIN_client;
    }

    public int getN_chambre() {
        return N_chambre;
    }

    public void setN_chambre(int N_chambre) {
        this.N_chambre = N_chambre;
    }

    public String getStatus() {
        return status;
    }

    // Setter to ensure valid status value
    public void setStatus(String status) {
        if (status.equals("en cours") || status.equals("confirmée") || status.equals("annulée")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status. Valid values are: en cours, confirmée, annulée");
        }
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

 
}
