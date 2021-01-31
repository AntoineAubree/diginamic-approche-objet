package fr.diginamic.salaire.entities;

public class Pigiste extends Intervenant {

	private int joursTravailles;
	private double montantJournalier;

	public Pigiste(String nom, String prenom, int joursTravailles, double montantJournalier) {
		super(nom, prenom);
		this.joursTravailles = joursTravailles;
		this.montantJournalier = montantJournalier;
	}

	public int getJoursTravailles() {
		return joursTravailles;
	}

	public void setJoursTravailles(int joursTravailles) {
		this.joursTravailles = joursTravailles;
	}

	public double getMontantJournalier() {
		return montantJournalier;
	}

	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}

	public double getSalaire() {
		return montantJournalier * joursTravailles;
	}

	public String getStatut() {
		return "Pigiste";
	}

}
