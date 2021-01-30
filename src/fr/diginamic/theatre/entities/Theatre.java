package fr.diginamic.theatre.entities;

public class Theatre {

	private String nom;
	private int capaciteMax;
	private int totalCLient;
	private double recetteTotale;

	public Theatre(String nom, int capaciteMax) {
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.totalCLient = 0;
		this.recetteTotale = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public int getTotalCLient() {
		return totalCLient;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

	public void inscrire(int nbClient, double prixPLace) {
		if (totalCLient + nbClient <= capaciteMax) {
			totalCLient += nbClient;
			recetteTotale += (nbClient * prixPLace);
			System.out.println("Vous venez de réserver " + nbClient + " places.");
			System.out.println("Il reste " + (capaciteMax - totalCLient) + " places disponibles.");
		} else if (totalCLient < capaciteMax) {
			System.out.println("Il ne reste plus que : " + (capaciteMax - totalCLient) + " places.");
		} else {
			System.out.println("Il ne reste plus de places.");
		}
	}
}
