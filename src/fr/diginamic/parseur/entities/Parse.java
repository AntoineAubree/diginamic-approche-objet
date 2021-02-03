package fr.diginamic.parseur.entities;

import java.util.regex.Pattern;

public class Parse {

	public static Expression parse(String chaine) {
		Expression expression = new Expression();
		char signe = verifierSigneOperateur(chaine);
		if (signe != ' ') {
			String membreGauche = chaine.substring(0, chaine.indexOf(signe));
			String membreDroite = chaine.substring(chaine.indexOf(signe) + 1);
			// TODO vérifier qu'un des 2 membres est castable en double
			if (Pattern.matches("[a-z]", membreGauche)) {
				expression = new Expression(membreGauche, membreDroite, signe);
			} else if (Pattern.matches("[a-z]", membreDroite)) {
				expression = new Expression(membreGauche, membreDroite, signe);
			} else {
				System.out.println("La chaîne ne contient pas de caractère correspondant à une variable ou de constante.");
				expression = null;
			}
		} else {
			System.out.println("La chaîne ne contient pas de signe opérateur.");
			expression = null;
		}
		return expression;
	}

	private static char verifierSigneOperateur(String chaine) {
		char[] tabSignes = { '+', '-', '/', '*' };
		char signe = ' ';
		for (char c : tabSignes) {
			if (chaine.indexOf(c) >= 0) {
				signe = c;
				break;
			}
		}
		return signe;
	}

}
