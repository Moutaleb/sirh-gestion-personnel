package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import dev.sgp.entite.CollabEvt;

@Stateless
public class ActiviteService {

	private List<CollabEvt> listActivite = new ArrayList<CollabEvt>();
	
	public void recevoirEvenementCollab(@Observes CollabEvt evt){
		listActivite.add(evt);
	}
	
	public List<CollabEvt> listerActivitesCollab() {
		return listActivite;
		
	}
	
}
