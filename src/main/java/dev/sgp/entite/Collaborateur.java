package dev.sgp.entite;
import java.time.*;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="collaborateur")
public class Collaborateur {
	
	@javax.persistence.Id
	String matricule;
	String nom;
	String prenom;
	String DateDeNaissance;
	String Adresse;
	String NuméroDeSecuSociale;
	String emailPro;
	String photo;
	String dateHeureCreation;
	Boolean actif;
	
	public Collaborateur() {
		super();
	}
	
	public Collaborateur(String nom, String prenom, String dateDeNaissance, String adresse,
			String numéroDeSecuSociale, String emailPro, String photo, String dateHeureCreation) {
		super();
		this.matricule = UUID.randomUUID().toString();;
		this.nom = nom;
		this.prenom = prenom;
		DateDeNaissance = dateDeNaissance;
		Adresse = adresse;
		NuméroDeSecuSociale = numéroDeSecuSociale;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		
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

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(String dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}
}