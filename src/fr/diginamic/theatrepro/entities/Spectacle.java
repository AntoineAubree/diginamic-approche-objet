package fr.diginamic.theatrepro.entities;

public class Spectacle {

	private String nom;
	private String type;
	private double tarifUnit;
	private int capaciteMax;
	private int nbInscrits;

	public Spectacle() {
	}

	public Spectacle(String nom, String type, double tarifUnit, int capaciteMax) {
		this.nom = nom;
		this.type = type;
		this.tarifUnit = tarifUnit;
		this.capaciteMax = capaciteMax;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTarifUnit() {
		return tarifUnit;
	}

	public void setTarifUnit(double tarifUnit) {
		this.tarifUnit = tarifUnit;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getNbInscrits() {
		return nbInscrits;
	}

	public void setNbInscrits(int nbInscrits) {
		this.nbInscrits = nbInscrits;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Spectacle [nom=");
		builder.append(nom);
		builder.append(", type=");
		builder.append(type);
		builder.append(", tarifUnit=");
		builder.append(tarifUnit);
		builder.append(", capaciteMax=");
		builder.append(capaciteMax);
		builder.append(", nbInscrits=");
		builder.append(nbInscrits);
		builder.append("]");
		return builder.toString();
	}

}
