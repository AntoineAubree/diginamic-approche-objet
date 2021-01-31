package fr.diginamic.salaire.entities;

public abstract class Intervenant {

	private String nom;
	private String prenom;

	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
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

	public abstract double getSalaire();

	public abstract String getStatut();

	public String afficherDonnees() {
		StringBuilder builder = new StringBuilder();
		builder.append("Intervenant [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", salaire=");
		builder.append(getSalaire());
		builder.append(", statut=");
		builder.append(getStatut());
		builder.append("]");
		return builder.toString();
	}

}
