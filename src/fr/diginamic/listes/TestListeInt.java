/**
 * 
 */
package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Antoine
 *
 */
public class TestListeInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> listeEntiers = new ArrayList<>();
		// Ajouter des �l�ments � la liste
		listeEntiers.add(-1);
		listeEntiers.add(5);
		listeEntiers.add(7);
		listeEntiers.add(3);
		listeEntiers.add(-2);
		listeEntiers.add(4);
		listeEntiers.add(8);
		listeEntiers.add(5);
		// Afficher tous les �l�ments de la liste
		for (Integer integer : listeEntiers) {
			System.out.println(integer);
		}
		// Afficher la taille de la liste
		System.out.println("---------------------------------------------");
		System.out.println("Taille de la liste : " + listeEntiers.size());
		// Rechercher et afficher le plus grand �l�ment de la liste
		System.out.println("---------------------------------------------");
		System.out.println("Plus grand �l�ment : " + Collections.max(listeEntiers));
		// Supprimer le plus petit �l�ment de la liste
		System.out.println("---------------------------------------------");
		listeEntiers.remove(Collections.min(listeEntiers));
		for (Integer integer : listeEntiers) {
			System.out.println(integer);
		}
		// Modifier les �l�ments n�gatifs
		System.out.println("---------------------------------------------");
		for (int i = 0; i < listeEntiers.size(); i++) {
			if (listeEntiers.get(i) < 0) {
				listeEntiers.set(i, Math.abs(listeEntiers.get(i)));
			}
		}
		for (Integer integer : listeEntiers) {
			System.out.println(integer);
		}

	}

}
