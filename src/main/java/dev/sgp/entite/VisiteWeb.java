package dev.sgp.entite;

public class VisiteWeb {

	int id;
	String chemin;
	int tempsExecution;

	public VisiteWeb(String chemin, int tempsExecution) {
		super();
		this.chemin = chemin;
		this.tempsExecution = tempsExecution;
	}

	public int getId() {
		return id;
	}

	public String getChemin() {
		return chemin;
	}

	public int getTempsExecution() {
		return tempsExecution;
	}
}
