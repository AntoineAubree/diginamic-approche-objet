package fr.diginamic.banque.entites;

public class Compte {

	private long numeroCompte;
	private float soldeCompte;

	public Compte(long numeroCompte, float soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public float getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(float soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compte [numeroCompte=");
		builder.append(numeroCompte);
		builder.append(", soldeCompte=");
		builder.append(soldeCompte);
		builder.append("]");
		return builder.toString();
	}

}
