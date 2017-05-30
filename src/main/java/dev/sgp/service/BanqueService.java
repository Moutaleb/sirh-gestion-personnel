package dev.sgp.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dev.sgp.entite.Banque;
import dev.sgp.entite.Collaborateur;

@Stateless
public class BanqueService {
	@PersistenceContext(unitName="sgp-pu") private EntityManager em;

	public List<Banque> listerCoordonneesBancaires() {
		return em.createQuery("select d from Banque d", Banque.class).getResultList();
	}

	public void sauvegarderBanque(Banque coor) {
		//listeDepartements.add(depar);
		em.persist(coor);
	}

	public void editerbanque(Banque bank) {
		// TODO Auto-generated method stub
		Banque banque = em.find(Banque.class, bank.getId());
		banque.setBanque(bank.getBanque());
		banque.setBic(bank.getBic());
		banque.setIban(bank.getIban());
        em.merge(banque);
		
	}
}
