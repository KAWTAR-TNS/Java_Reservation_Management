package entities;

import java.sql.Timestamp;

public class Client {
	private int id  ;
	private String CIN ;
	private String N_Complet ;
	private String telephone ;
	private String email ;
    private Timestamp created_at;
	
    public Client(int id, String CIN, String N_Complet, String telephone, String email, Timestamp created_at) {
        this.id = id;
        this.CIN = CIN;
        this.N_Complet = N_Complet;
        this.telephone = telephone;
        this.email = email;
        this.created_at = created_at;
    }
    public Client(String CIN, String N_Complet, String telephone, String email, Timestamp created_at) {
        this.CIN = CIN;
        this.N_Complet = N_Complet;
        this.telephone = telephone;
        this.email = email;
        this.created_at = created_at;
    }


	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Client(String cIN, String n_Complet, String telephone, String email) {
		CIN = cIN;
		N_Complet = n_Complet;
		this.telephone = telephone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getN_Complet() {
		return N_Complet;
	}

	public void setN_Complet(String n_Complet) {
		N_Complet = n_Complet;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	



}




