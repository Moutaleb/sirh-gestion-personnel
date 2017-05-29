package dev.sgp.ecouteur;

import java.util.stream.Stream;
import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;

@WebListener
public class Ecouteur implements ServletContextListener {
    
    @Inject private CollaborateurService collabService;
    @Inject private DepartementService depService;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
         Stream.of(new Departement(1,"departement 1"),
        		new Departement(2,"departement 2"),
        		new Departement(3,"departement 3")
        	).forEach(dep -> depService.sauvegarderDepartement(dep));
        
        Stream.of(
                new Collaborateur("El bouazzati", "Abdelmoutaleb", "1994-11-02", "70 rue claude debussy", "121212121212121",new Departement(1,"departement 1")),
                new Collaborateur("Brenghes", "Pierre","1993-02-05", "14 rue de la loire", "12893466645121",new Departement(1,"departement 1")),
                new Collaborateur("Robert", "Sophie", "1993-06-25", "19 rue de la république", "126666666662121",new Departement(2,"departement 2")),
                new Collaborateur("Croche", "Sarah", "1992-08-05", "20 rue des rappels", "1212789661212121",new Departement(1,"departement 1")),
                new Collaborateur("Pop", "Corn", "1990-01-01", "12 rue de la jorhardiere", "121212121212121",new Departement(1,"departement 1"))
                
        ).forEach(collab -> collabService.sauvegarderCollaborateur(collab));
        
       

		
        
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        
    }
}