package dev.sgp.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.sgp.entite.Departement;

@Path("/departements")
public class DepartementResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Departement> list() {

		List<Departement> departements = new ArrayList<Departement>();
		departements.add(new Departement(1,"departement 1"));
		departements.add(new Departement(2,"departement 2"));
		departements.add(new Departement(3,"departement 3"));
		return departements;

	}
}