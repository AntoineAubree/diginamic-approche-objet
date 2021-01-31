package fr.diginamic.salaire.essais;

import fr.diginamic.salaire.entities.Pigiste;
import fr.diginamic.salaire.entities.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie01 = new Salarie("L'Asticot", "Coco", 2_236.58);
		Pigiste pigiste01 = new Pigiste("L'enchanteur", "Merlin", 15, 95.34);
		System.out.println(salarie01.getSalaire());
		System.out.println(pigiste01.getSalaire());
		System.out.println(salarie01.afficherDonnees());
		System.out.println(pigiste01.afficherDonnees());
	}

}
