package fr.diginamic.adressepostale.entities;

public class AdressePostale {

	private int numeroRue;
	private String libelleRue;
	private String codePostal;
	private String ville;

	public AdressePostale(int numeroRue, String libelleRue, String codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdressePostale [numeroRue=");
		builder.append(numeroRue);
		builder.append(", libelleRue=");
		builder.append(libelleRue);
		builder.append(", codePostal=");
		builder.append(codePostal);
		builder.append(", ville=");
		builder.append(ville);
		builder.append("]");
		return builder.toString();
	}

}
