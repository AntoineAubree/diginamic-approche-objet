package fr.diginamic.tri.entities;

public class Ville implements Comparable<Ville> {

	private String nom;
	private long nbHab;

	public Ville(String nom, long nbHab) {
		this.nom = nom;
		this.nbHab = nbHab;
	}

	// Méthode pour trier par ordre alphabétique du nom de ville
//	@Override
//	public int compareTo(Ville ville) {
//		return this.nom.compareTo(ville.getNom());
//	}

	// Méthode pour trier par nombre d'habitants
	@Override
	public int compareTo(Ville ville) {
		if (this.nbHab > ville.nbHab) {
			return 1;
		} else if (this.nbHab < ville.nbHab) {
			return -1;
		} else {
			return 0;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNbHab() {
		return nbHab;
	}

	public void setNbHab(long nbHab) {
		this.nbHab = nbHab;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ville [nom=");
		builder.append(nom);
		builder.append(", nbHab=");
		builder.append(nbHab);
		builder.append("]");
		return builder.toString();
	}

}
