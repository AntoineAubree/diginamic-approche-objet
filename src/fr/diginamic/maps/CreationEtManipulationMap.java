package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		// Afficher l'ensemble des clés
		System.out.println("Ensemble des clés contenues dans la map :");
		Iterator<Integer> clesVilles = mapVilles.keySet().iterator();
		while (clesVilles.hasNext()) {
			System.out.println(clesVilles.next());
		}
		// Afficher l'ensemble des valeurs
		System.out.println("-------------------------------");
		System.out.println("Ensemble des valeurs contenues dans la map :");
		Iterator<String> valeursVilles = mapVilles.values().iterator();
		while (valeursVilles.hasNext()) {
			System.out.println(valeursVilles.next());
		}
		// Taille de la map
		System.out.println("-------------------------------");
		System.out.println("Taille de la map : " + mapVilles.size());

	}

}
