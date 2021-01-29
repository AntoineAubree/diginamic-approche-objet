package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private float tauxRemuneration;

	public CompteTaux(String numeroCompte, double soldeCompte, float tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}

	public float getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(float tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompteTaux [tauxRemuneration=");
		builder.append(tauxRemuneration);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
