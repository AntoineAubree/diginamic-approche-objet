package fr.diginamic.parseur.entities;

public class Expression {

	private String membreGauche;
	private String membreDroit;
	private char signe;

	public Expression(String membreGauche, String membreDroit, char signe) {
		this.membreGauche = membreGauche;
		this.membreDroit = membreDroit;
		this.signe = signe;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expression [membreGauche=");
		builder.append(membreGauche);
		builder.append(", membreDroit=");
		builder.append(membreDroit);
		builder.append(", signe=");
		builder.append(signe);
		builder.append("]");
		return builder.toString();
	}

}
