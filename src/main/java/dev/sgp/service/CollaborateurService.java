package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService {

	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	

	public CollaborateurService() {
	
		Collaborateur collab = new Collaborateur("pierre", "abdel", "01/01/90", "4 rue edith piaf", "az15478963214789", "brenghes@hotmail.com");
		listeCollaborateurs.add(collab);
		
	}

	public List<Collaborateur> listerCollaborateurs() {

		return listeCollaborateurs;

	}

	public void sauvegarderCollaborateur(Collaborateur collab) {

		listeCollaborateurs.add(collab);

	}

}