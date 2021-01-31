package fr.diginamic.formes.entities;

public class Rectangle extends Forme {

	private int longueur;
	private int largeur;

	public Rectangle(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre() {
		return 2 * (longueur + largeur);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [longueur=");
		builder.append(longueur);
		builder.append(", largeur=");
		builder.append(largeur);
		builder.append("]");
		return builder.toString();
	}

}
