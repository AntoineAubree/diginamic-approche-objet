package fr.diginamic.theatrepro.entities;

public class TheatrePro {

	private String nom;
	private Spectacle[] tabSpectacles;

	public TheatrePro(String nom) {
		this.nom = nom;
		this.tabSpectacles = new Spectacle[0];
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Spectacle getSpectacle(String nomSpectacle) {
		Spectacle spectacle = new Spectacle();
		for (Spectacle spectacleLoop : tabSpectacles) {
			if (spectacleLoop.getNom().equals(nomSpectacle)) {
				spectacle = spectacleLoop;
			}
		}
		if (spectacle.getNom() != null) {
			return spectacle;
		} else {
			System.out.println("Ce spectacle n'existe pas");
			return null;
		}
	}

	public void ajouterSpectacle(Spectacle spectacle) {
		Spectacle[] newTab = new Spectacle[tabSpectacles.length + 1];
		for (int i = 0; i < tabSpectacles.length; i++) {
			newTab[i] = tabSpectacles[i];
		}
		tabSpectacles = newTab;
		tabSpectacles[tabSpectacles.length - 1] = spectacle;
	}

	public void inscrire(int nbClients, String nomSpectacle) {
		Spectacle spectacle = new Spectacle();
		for (Spectacle spectacleLoop : tabSpectacles) {
			if (spectacleLoop.getNom().equals(nomSpectacle)) {
				spectacle = spectacleLoop;
			}
		}
		if (spectacle.getNom() != null) {
			if (spectacle.getNbInscrits() + nbClients <= spectacle.getCapaciteMax()) {
				spectacle.setNbInscrits(spectacle.getNbInscrits() + nbClients);
				System.out.println("Vous venez de réserver " + nbClients + " places.");
				System.out.println("Il reste " + (spectacle.getCapaciteMax() - spectacle.getNbInscrits())
						+ " places disponibles.");
			} else if (spectacle.getNbInscrits() < spectacle.getCapaciteMax()) {
				System.out.println("Il ne reste plus que : " + (spectacle.getCapaciteMax() - spectacle.getNbInscrits())
						+ " places.");
			} else {
				System.out.println("Il ne reste plus de places.");
			}
		} else {
			System.out.println("Ce spectacle n'existe pas");
		}
	}
	
	public double getRecetteTotale() {
		double recette = 0;
		for (Spectacle spectacle : tabSpectacles) {
			recette += spectacle.getNbInscrits()*spectacle.getTarifUnit();
		}
		return recette;
	}

	public int getNbTotalClients() {
		int clients = 0;
		for (Spectacle spectacle : tabSpectacles) {
			clients += spectacle.getNbInscrits();
		}
		return clients;
	}

}
