package entites;

public class AdressePostale {

	public int numeroRue;
	public String libelleRue;
	public String codePostal;
	public String ville;

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
