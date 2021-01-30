package fr.diginamic.calculmoyenne.essais;

import fr.diginamic.calculmoyenne.entities.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne tabDoubles01 = new CalculMoyenne();
		tabDoubles01.ajout(50);
		tabDoubles01.ajout(50);
		System.out.println(tabDoubles01.calcul());
		tabDoubles01.ajout(150);
		tabDoubles01.ajout(150);
		System.out.println(tabDoubles01.calcul());
		
	}

}
