package fr.diginamic.maison.entities;

public abstract class Piece {

	private double superficie;
	private int etage;

	public Piece(double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

}
