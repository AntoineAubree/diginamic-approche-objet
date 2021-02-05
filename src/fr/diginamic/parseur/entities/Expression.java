package fr.diginamic.parseur.entities;

public class Expression {

	private String membreGauche;
	private char signe;
	private String membreDroit;

	public Expression() {
	}

	public Expression(String membreGauche, char signe, String membreDroit) {
		this.membreGauche = membreGauche;
		this.signe = signe;
		this.membreDroit = membreDroit;
	}

	public double evaluer(String nomVariable, double valeurVariable) {
		double resultat = 0;
		if (membreGauche.equals(nomVariable)) {
			switch (this.signe) {
			case '+':
				resultat = valeurVariable + Double.parseDouble(membreDroit);
				break;
			case '-':
				resultat = valeurVariable - Double.parseDouble(membreDroit);
				break;
			case '*':
				resultat = valeurVariable * Double.parseDouble(membreDroit);
				break;
			case '/':
				resultat = valeurVariable / Double.parseDouble(membreDroit);
				break;
			}
		} else if (membreDroit.equals(nomVariable)) {
			switch (this.signe) {
			case '+':
				resultat = Double.parseDouble(membreGauche) + valeurVariable;
				break;
			case '-':
				resultat = Double.parseDouble(membreGauche) - valeurVariable;
				break;
			case '*':
				resultat = Double.parseDouble(membreGauche) * valeurVariable;
				break;
			case '/':
				resultat = Double.parseDouble(membreGauche) / valeurVariable;
				break;
			}
		} else {
			System.out.println(
					"Le nom de la variable passée en argument de la méthode ne correspond pas au nom de la variable de l'expression");
		}
		return resultat;
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
