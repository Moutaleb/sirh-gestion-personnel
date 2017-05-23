package dev.sgp.entite;
import java.time.*;
import javax.persistence.Entity;
@Entity
public class Collaborateur {
	String matricule;
	String nom;
	String prenom;
	String DateDeNaissance;
	String Adresse;
	String NuméroDeSecuSociale;
	String emailPro;
	String photo;
	ZonedDateTime dateHeureCreation;
	Boolean actif;
	
	public Collaborateur(String nom, String prenom, String dateDeNaissance, String adresse,
			String numéroDeSecuSociale,String emailPro) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.DateDeNaissance = DateDeNaissance;
		Adresse = adresse;
		NuméroDeSecuSociale = numéroDeSecuSociale;
		this.emailPro = emailPro;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateDeNaissance() {
		return this.DateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.DateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getNuméroDeSecuSociale() {
		return NuméroDeSecuSociale;
	}

	public void setNuméroDeSecuSociale(String numéroDeSecuSociale) {
		NuméroDeSecuSociale = numéroDeSecuSociale;
	}
}