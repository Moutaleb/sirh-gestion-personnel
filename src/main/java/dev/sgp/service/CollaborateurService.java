package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import dev.sgp.entite.Banque;
import dev.sgp.entite.CollabEvt;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.TypeCollabEvt;

@Stateless
public class CollaborateurService {


	@PersistenceContext(unitName="sgp-pu") private EntityManager em;

	@Inject Event<CollabEvt> collabEvt;

	//List<Collaborateur> listeCollaborateurs = new ArrayList<>();

	public CollaborateurService() {

	}

	public List<Collaborateur> listerCollaborateurs() {

		Query query = em.createQuery("select collab from Collaborateur collab");        
		return (List<Collaborateur>) query.getResultList();


	}

	public void sauvegarderCollaborateur(Collaborateur collab) {

		CollabEvt nouveauCollabEvt = new CollabEvt(TypeCollabEvt.CREATION_COLLAB,collab.getMatricule());

		collabEvt.fire(nouveauCollabEvt); // déclenche un nouvel événement
		em.persist(collab);

	}

	public void editerCollaborateur() {


	}

	public List<Collaborateur> listerCollaborateursDepartementId(Integer departement_id) {
		return em.createQuery("select collab from Collaborateur collab where collab.departement.id= "+departement_id,Collaborateur.class).getResultList();


	}

	public Collaborateur listerCollaborateursMatricule(String matricule) {

		return em.createQuery("select collab from Collaborateur collab WHERE collab.matricule=:matricule",Collaborateur.class).setParameter("matricule", matricule).getResultList().get(0);        



	}

	public void editerCollaborateursMatricule(Collaborateur collab) {

		Collaborateur collaborateur = em.find(Collaborateur.class, collab.getMatricule());
        collaborateur.setEmailPro(collab.getEmailPro());
        collaborateur.setActif(collab.getActif());
        collaborateur.setAdresse(collab.getAdresse());
        collaborateur.setDateHeureCreation(collab.getDateHeureCreation());
        collaborateur.setDateDeNaissance(collab.getDateDeNaissance());
        collaborateur.setDepartement(collab.getDepartement());
        collaborateur.setPhoto(collab.getPhoto());
        em.merge(collaborateur);
}/*
	public void editerCollaborateursrib(Banque bank) {

		Banque banque = em.find(Collaborateur.class, bank.get());
		banque.setBanque(bank.getBanque());
        em.merge(banque);
}*/
}