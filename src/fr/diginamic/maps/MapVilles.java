package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.listes.entities.Ville;

public class MapVilles {

	public static void main(String[] args) {
		Ville nice = new Ville("Nice", 343_000);
		Ville carcassonne = new Ville("Carcassonne", 47_800);
		Ville narbonne = new Ville("Narbonne", 53_400);
		Ville lyon = new Ville("Lyon", 484_000);
		Ville foix = new Ville("Foix", 9_700);
		Ville pau = new Ville("Pau", 77_200);
		Ville marseille = new Ville("Marseille", 850_700);
		Ville tarbes = new Ville("Tarbes", 40_600);

		HashMap<String, Ville> villes = new HashMap<>();

		villes.put(nice.getNom(), nice);
		villes.put(carcassonne.getNom(), carcassonne);
		villes.put(narbonne.getNom(), narbonne);
		villes.put(lyon.getNom(), lyon);
		villes.put(foix.getNom(), foix);
		villes.put(pau.getNom(), pau);
		villes.put(marseille.getNom(), marseille);
		villes.put(tarbes.getNom(), tarbes);

		// Afficher la map
		afficherMap(villes);
		// Supprimer la ville avec le moins d'habitants (3x)
		supprimerVilleMoinsPeuplee(villes);
		supprimerVilleMoinsPeuplee(villes);
		supprimerVilleMoinsPeuplee(villes);
		// Afficher la map
		afficherMap(villes);

	}

	private static void supprimerVilleMoinsPeuplee(HashMap<String, Ville> villes) {
		String cleVilleMoinsPeuplee = null;
		Iterator<Ville> iterValeursVilles = villes.values().iterator();
		while (iterValeursVilles.hasNext()) {
			String cleNext = iterValeursVilles.next().getNom();
			if (cleVilleMoinsPeuplee == null) {
				cleVilleMoinsPeuplee = cleNext;
			} else if (villes.get(cleNext).getNbHab() < villes.get(cleVilleMoinsPeuplee).getNbHab()) {
				cleVilleMoinsPeuplee = cleNext;
			}
		}
		villes.remove(cleVilleMoinsPeuplee);
	}

	private static void afficherMap(HashMap<String, Ville> villes) {
		Iterator<Ville> iterVillesValues = villes.values().iterator();
		while (iterVillesValues.hasNext()) {
			System.out.println(iterVillesValues.next());
		}
		System.out.println("------------------------------");
	}

}
