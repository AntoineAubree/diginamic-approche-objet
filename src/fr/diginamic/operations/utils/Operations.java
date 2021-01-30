package fr.diginamic.operations.utils;

public class Operations {

	public static double calcul(double a, double b, char operateur) {
		double resultat = 0;
		if (operateur == '+') {
			resultat = a + b;
		} else if (operateur == '-') {
			resultat = a - b;
		} else if (operateur == '*') {
			resultat = a * b;
		} else if (operateur == '/') {
			resultat = a / b;
		} 
		return resultat;
	}

}
