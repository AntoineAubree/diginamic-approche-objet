/**
 * 
 */
package fr.diginamic.listes;

import java.util.ArrayList;

/**
 * @author Antoine
 *
 */
public class CreationListe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Exercice 1 :
		ArrayList<Integer> liste = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			liste.add(i);
		}
		System.out.println("Taille de la liste : " + liste.size());
	}

}
