package dev.sgp.web;

import java.io.IOException;
import java.time.ZonedDateTime;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;


@WebServlet("/collaborateur/nouveau")
public class NouveauCollaborateursController extends HttpServlet {

	// récupération du service

	@Inject private CollaborateurService collabService;

	@Override

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		String dateDeNaissance = request.getParameter("dateDeNaissance");
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
//		formatter = formatter.withLocale(Locale.FRANCE);
//     	LocalDate dateNaissance = LocalDate.parse(dateNaissanceBefore, formatter);
//		
		
		String adresse = request.getParameter("adresse");
		String numsecu = request.getParameter("numeroDeSecuSociale");

		Collaborateur collab = new Collaborateur(nom,prenom,dateDeNaissance,adresse,numsecu);
		collab.setNom(nom);
		collab.setPrenom(prenom);
		collab.setDateDeNaissance(dateDeNaissance);
		collab.setNuméroDeSecuSociale(numsecu);
		
		collab.setAdresse(adresse);	
		//collaborateurs.add(collab);
		
		collabService.sauvegarderCollaborateur(collab);	
		response.sendRedirect(request.getContextPath() + "/collaborateurs/lister");
		//List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();

        //request.setAttribute("collaborateurs", collaborateurs);
        //doGet(request, response);
		
	}
	protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateurs.jsp").forward(req, resp);
		
	}
	
}