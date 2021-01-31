package fr.diginamic.formes.essais;

import fr.diginamic.formes.entities.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {
		System.out.println(forme.getClass().getSimpleName());
		System.out.println("périmètre : " + forme.calculerPerimetre());
		System.out.println("surface : " + forme.calculerSurface());
	}

}
