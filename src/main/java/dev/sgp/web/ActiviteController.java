package dev.sgp.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.ActiviteService;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.VisiteWebService;



@WebServlet("/collaborateur/activités")
public class ActiviteController  extends HttpServlet  {
	// récupération du service
	@Inject private ActiviteService listeActivites; 
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// A ajouter
			req.setAttribute("ActiviteLog", listeActivites.listerActivitesCollab());
			req.getRequestDispatcher("/WEB-INF/views/collab/activiteCollaborateurs.jsp").forward(req, resp);

		}

	}


