package fr.diginamic.cercle.entities;

public class Cercle {

	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public double getSurface() {
		return Math.PI * Math.pow(rayon, 2);
	}

	public double getPerimetre() {
		return 2 * Math.PI * rayon;
	}

}
