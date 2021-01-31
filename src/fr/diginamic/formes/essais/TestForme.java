package fr.diginamic.formes.essais;

import fr.diginamic.formes.entities.Carre;
import fr.diginamic.formes.entities.Cercle;
import fr.diginamic.formes.entities.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle = new Cercle(12);
		Rectangle rectangle = new Rectangle(10, 5);
		Carre carre = new Carre(12);
		
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rectangle);
		AffichageForme.afficher(carre);
	}

}
