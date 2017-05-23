package dev.sgp.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;


@WebServlet("/collaborateur/statistique")
public class StatistiqueController  extends HttpServlet  {
	
	// récupération du service

		private VisiteWebService listeVisite = Constantes.Visite_SERVICE;

		
		@Override

		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			
			
			// A ajouter
			req.setAttribute("VisiteLog", listeVisite.construireStatistiques());
			req.getRequestDispatcher("/WEB-INF/views/collab/statistiquesCollaborateurs.jsp").forward(req, resp);

		}

	}


