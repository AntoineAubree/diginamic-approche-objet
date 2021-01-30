package fr.diginamic.operations.essais;

import fr.diginamic.operations.utils.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		double resultatAddition = Operations.calcul(150, 50, '+');
		double resultatSoustraction = Operations.calcul(150, 50, '-');
		double resultatMutliplication = Operations.calcul(150, 50, '*');
		double resultatDivision = Operations.calcul(150, 50, '/');
		
		System.out.println("150 + 50 = " + resultatAddition);
		System.out.println("150 - 50 = " + resultatSoustraction);
		System.out.println("150 * 50 = " + resultatMutliplication);
		System.out.println("150 / 50 = " + resultatDivision);
	}

}
