package fr.diginamic.maps.entities;

public class Pays {

	private String nom;
	private long nbHab;
	private String continent;

	public Pays() {
	}

	public Pays(String nom, long nbHab, String continent) {
		this.nom = nom;
		this.nbHab = nbHab;
		this.continent = continent;
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

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pays [nom=");
		builder.append(nom);
		builder.append(", nbHab=");
		builder.append(nbHab);
		builder.append(", continent=");
		builder.append(continent);
		builder.append("]");
		return builder.toString();
	}

}
