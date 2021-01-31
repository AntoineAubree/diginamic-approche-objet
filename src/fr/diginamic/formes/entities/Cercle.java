package fr.diginamic.formes.entities;

public class Cercle extends Forme {

	private int rayon;

	public Cercle(int rayon) {
		this.rayon = rayon;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		return Math.PI * Math.pow(rayon, 2);
	}

	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
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
