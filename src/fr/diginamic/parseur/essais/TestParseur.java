package fr.diginamic.parseur.essais;

import fr.diginamic.parseur.entities.Expression;
import fr.diginamic.parseur.entities.Parser;

public class TestParseur {

	public static void main(String[] args) {
		String chaine = "x+3";
		Expression expr = Parser.parse(chaine);
		if (expr!=null) {
			double resultat = expr.evaluer("x", 2.5);
			System.out.println(resultat);
		}
	}

}
