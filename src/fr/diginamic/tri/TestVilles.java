package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

import fr.diginamic.tri.entities.Ville;

public class TestVilles {

	public static void main(String[] args) {
		Ville nice = new Ville("Nice", 343_000);
		Ville carcassonne = new Ville("Carcassonne", 47_800);
		Ville narbonne = new Ville("Narbonne", 53_400);
		Ville lyon = new Ville("Lyon", 484_000);
		Ville foix = new Ville("Foix", 9_700);
		Ville pau = new Ville("Pau", 77_200);
		Ville marseille = new Ville("Marseille", 850_700);
		Ville tarbes = new Ville("Tarbes", 40_600);

		ArrayList<Ville> villes = new ArrayList<>();

		villes.add(nice);
		villes.add(carcassonne);
		villes.add(narbonne);
		villes.add(lyon);
		villes.add(foix);
		villes.add(pau);
		villes.add(marseille);
		villes.add(tarbes);

		// Tri avec l'interface Comparable
		Collections.sort(villes);
		for (Ville ville : villes) {
			System.out.println(ville);
		}

		// Tri avec la Class ComparatorNom
		System.out.println("-------------------------------------");
		Collections.sort(villes, new ComparatorNom());
		for (Ville ville : villes) {
			System.out.println(ville);
		}

		// Tri avec la Class ComparatorHabitant
		System.out.println("-------------------------------------");
		Collections.sort(villes, new ComparatorHabitant());
		for (Ville ville : villes) {
			System.out.println(ville);
		}
	}

}
