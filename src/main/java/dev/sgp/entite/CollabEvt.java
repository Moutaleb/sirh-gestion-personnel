package dev.sgp.entite;

import java.time.ZonedDateTime;



public class CollabEvt {
	
	ZonedDateTime dateHeure;
	TypeCollabEvt type;
	String matricule;
	
	public CollabEvt(TypeCollabEvt type, String matricule) {
		super();
		this.dateHeure = ZonedDateTime.now();
		this.type = type;
		this.matricule = matricule;
	}

	public ZonedDateTime getDateHeure() {
		return dateHeure;
	}

	public TypeCollabEvt getType() {
		return type;
	}

	public String getMatricule() {
		return matricule;
	}

}
