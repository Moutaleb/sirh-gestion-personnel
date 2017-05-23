package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.VisiteWeb;

public class VisiteWebService {

	List<VisiteWeb> listeVisite = new ArrayList<>();


	public List<VisiteWeb> visiteCollaborateurs() {

		return listeVisite;

	}

	public void sauvegarderVisite(VisiteWeb visite) {

		listeVisite.add(visite);

	}

}