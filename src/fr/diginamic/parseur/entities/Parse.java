package fr.diginamic.parseur.entities;

public class Parse {

	public static Expression parse(String chaine) {
		char[] tabSignes = { '+', '-', '/', '*' };
		char signe = ' ';
		for (char c : tabSignes) {
			if (chaine.indexOf(c) >= 0) {
				signe = c;
				break;
			}
		}
		if (signe == ' ') {
			System.out.println("La chaîne ne contient pas de signe.");
			return null;
		} else {
			return new Expression(chaine.substring(0, chaine.indexOf(signe)),
					chaine.substring(chaine.indexOf(signe) + 1), signe);
		}
	}

}
