package fr.diginamic.personne.entities;

import fr.diginamic.adressepostale.entities.AdressePostale;

public class Personne {

	private String nom;
	private String prenom;
	private AdressePostale adressePostale;

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this(nom, prenom);
		this.adressePostale = adressePostale;
	}

	public void displayNameToUppercase() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personne [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", adressePostale=");
		builder.append(adressePostale);
		builder.append("]");
		return builder.toString();
	}

}
