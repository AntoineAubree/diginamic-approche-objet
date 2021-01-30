package fr.diginamic.cercle.essais;

import fr.diginamic.cercle.entities.Cercle;
import fr.diginamic.cercle.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle01 = new Cercle(2.5);
		Cercle cercle02 = new Cercle(25);

		Cercle[] tabCercles = { cercle01, cercle02 };

		for (Cercle cercle : tabCercles) {
			System.out.println("Le périmètre d'un cercle de rayon de " + cercle.getRayon() + " est : "
					+ cercle.getPerimetre() + " et sa surface est : " + cercle.getSurface());
		}
		
		// Execrice CercleFactory
		Cercle cercle03 = CercleFactory.createCerlce(6.8);
		Cercle cercle04 = CercleFactory.createCerlce(656.24);
		
	}

}
