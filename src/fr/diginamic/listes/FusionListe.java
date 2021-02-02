/**
 * 
 */
package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Antoine
 *
 */
public class FusionListe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		List<String> liste3 = new ArrayList<String>();
		for (String string1 : liste1) {
			liste3.add(string1);
		}
		for (String string2 : liste2) {
			liste3.add(string2);
		}
		for (String string3 : liste3) {
			System.out.println(string3);
		}
		
	}

}
