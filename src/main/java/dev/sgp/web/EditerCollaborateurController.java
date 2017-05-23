package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet  {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// récupère la valeur d'un paramètre dont le nom est avecPhoto
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		String datenaissanceParam = req.getParameter("datenaissance");
		String adresseParam = req.getParameter("adresse");
		String numsecuParam = req.getParameter("numsecu");
		String emailproParam = req.getParameter("emailpro");

		resp.setContentType("text/html");

		if(nomParam == null || prenomParam == null || datenaissanceParam == null || adresseParam == null || numsecuParam == null || emailproParam == null ){

			String res = "Les paramètres suivants sont incorrects :\r";
			if(nomParam == null) res+="nom\r";
			if(prenomParam == null) res+="prenom\r";
			if(datenaissanceParam == null) res+="datenaissance\r";
			if(adresseParam == null) res+="adresse\r";
			if(numsecuParam == null) res+="numsecu\r";
			if(emailproParam == null) res+="emailpro\r";


			resp.sendError(400,res);
		} else {
			// code HTML écrit dans le corps de la réponse
			resp.setStatus(201);
			resp.getWriter().write("Création d’un collaborateur avec les informations suivantes :"
					+ "nom="+nomParam+","
					+ "prenom="+prenomParam+","
			        + "datenaissance="+datenaissanceParam+","
			        + "adresse="+adresseParam+","
			        + "numsecu="+numsecuParam+","
			        + "emailpro="+emailproParam);

		}
	}}
