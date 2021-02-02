package fr.diginamic.interfaces;

public class Cercle implements ObjetGeometrique {

	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}

	@Override
	public double surface() {
		return Math.PI * Math.pow(rayon, 2);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cercle [rayon=");
		builder.append(rayon);
		builder.append("]");
		return builder.toString();
	}
}
