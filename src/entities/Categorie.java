package entities;

public class Categorie {
private int id ;
private String  libelle ;
private double Prix ;

//constructor
public Categorie(  String libelle , double Prix) {
this.Prix=Prix;
	this.libelle = libelle;
}

public Categorie(int id,  String libelle , double Prix) {
this.id=id;
	this.Prix=Prix;
	this.libelle = libelle;
}

//getters and setters 
public int getId() {
	return id;
}
public double getPrix() {return Prix;}

public void setId(int id) {
	this.id = id;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}

}
