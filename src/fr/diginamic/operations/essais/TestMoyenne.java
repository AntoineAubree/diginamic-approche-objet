package fr.diginamic.operations.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne calc01 = new CalculMoyenne();
		calc01.ajout(50);
		calc01.ajout(50);
		System.out.println(calc01.calcul());
		calc01.ajout(150);
		calc01.ajout(150);
		System.out.println(calc01.calcul());
		
	}

}
