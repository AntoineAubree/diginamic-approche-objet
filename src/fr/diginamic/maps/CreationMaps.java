/**
 * 
 */
package fr.diginamic.maps;

import java.util.HashMap;

/**
 * @author Antoine
 *
 */
public class CreationMaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<String, Double> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", 1750D);
		mapSalaires.put("Hicham", 1825D);
		mapSalaires.put("Yu", 2250D);
		mapSalaires.put("Ingrid", 2015D);
		mapSalaires.put("Chantal", 2418D);
		
		// Afficher la taille de la map
		System.out.println("Taille de la map : " + mapSalaires.size());

	}

}
