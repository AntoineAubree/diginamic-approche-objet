package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		// Créer map3 qui contient l'ensemble des données de map1 et map2
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		putMapInNewMap(map1, map3);
		putMapInNewMap(map2, map3);

		// Afficher l'ensemble des clés et des valeurs
		afficherMap(map3);

	}

	private static void afficherMap(HashMap<Integer, String> map) {
		System.out.println("Ensemble des clés et des valeurs contenues dans la map :");
		Iterator<Integer> cleMap = map.keySet().iterator();
		while (cleMap.hasNext()) {
			Integer cleNext = cleMap.next();
			System.out.println(cleNext + " : " + map.get(cleNext));
		}
	}

	/**
	 * 
	 * @param oldMap
	 * @param newMap
	 */
	private static void putMapInNewMap(HashMap<Integer, String> oldMap, HashMap<Integer, String> newMap) {
		Iterator<Integer> cleMap = oldMap.keySet().iterator();
		while (cleMap.hasNext()) {
			Integer cleNext = cleMap.next();
			newMap.put(cleNext, oldMap.get(cleNext));
		}
	}

}
