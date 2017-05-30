package dev.sgp.entite;
import java.time.*;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
public class Collaborateur {
	
	@javax.persistence.Id
	private String matricule;
	private String nom;
	private String prenom;
	private String DateDeNaissance;
	private String Adresse;
	private String NuméroDeSecuSociale;
	private String emailPro;
	private String photo;
	private String dateHeureCreation;
	private Boolean actif;
	@ManyToOne
	private Departement departement;
	@OneToOne
	private Banque banque;
	


	
	
	public Collaborateur() {
		super();
	}
	
	public Collaborateur(String nom, String prenom, String dateDeNaissance, String adresse,
			String numéroDeSecuSociale, Departement departement, Banque banque) {
		super();
		this.matricule = nom+prenom;
		this.nom = nom;
		this.prenom = prenom;
		DateDeNaissance = dateDeNaissance;
		Adresse = adresse;
		NuméroDeSecuSociale = numéroDeSecuSociale;
		this.emailPro = prenom + "." + nom + "@societe.com";
		this.dateHeureCreation = LocalDate.now().toString();
		this.departement = departement;
		this.banque = banque;


		
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

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}
}