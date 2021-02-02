/**
 * 
 */
package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Antoine
 *
 */
public class TestListeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> villes = new ArrayList<>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");

		// Rechercher la ville avec le plus grand nombre de lettres
		int indexVillePlusLongue = 0;
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).length() > villes.get(indexVillePlusLongue).length()) {
				indexVillePlusLongue = i;
			}
		}
		System.out.println("Ville avec le plus grand nombre de lettres : " + villes.get(indexVillePlusLongue));
		// Mettre des majuscules à toutes les villes
		System.out.println("--------------------------------------");
		for (int i = 0; i < villes.size(); i++) {
			villes.set(i, villes.get(i).toUpperCase());
		}
		for (String ville : villes) {
			System.out.println(ville);
		}
		// Supprimer les villes dont le nom commence par N
		System.out.println("--------------------------------------");
		Iterator<String> iterator = villes.iterator();
		while (iterator.hasNext()) {
			String ville = iterator.next();
			if (ville.charAt(0) == 'N') {
				iterator.remove();
			}
		}
		for (String ville : villes) {
			System.out.println(ville);
		}
	}

}
