package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class NouveauCollaborateursController extends HttpServlet {

	// récupération du service

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		String dateDeNaissance = request.getParameter("dateDeNaissance");
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
//		formatter = formatter.withLocale(Locale.FRANCE);
//		LocalDate dateNaissance = LocalDate.parse(dateNaissanceBefore, formatter);
//		
		
		String adresse = request.getParameter("adresse");
		String numsecu = request.getParameter("numsecu");
		
		String emailPro = prenom + "." + nom + "@societe.com" ;
		Collaborateur collab = new Collaborateur(nom,prenom,dateDeNaissance,adresse,numsecu,emailPro);
		collab.setNom(nom);
		collab.setPrenom(prenom);
		//collab.setDateDeNaissance(dateDeNaissance);
		collab.setNuméroDeSecuSociale(numsecu);
		
		collab.setAdresse(adresse);	
		//collaborateurs.add(collab);
		
		collabService.sauvegarderCollaborateur(collab);	
		
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();

        request.setAttribute("collaborateurs", collaborateurs);
        doGet(request, response);
	}
	protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateurs.jsp").forward(req, resp);
		
	}
	
}