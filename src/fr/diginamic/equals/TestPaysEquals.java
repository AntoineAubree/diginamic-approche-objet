/**
 * 
 */
package fr.diginamic.equals;

import fr.diginamic.equals.entities.Pays;

/**
 * @author Antoine
 *
 */
public class TestPaysEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pays pays1 = new Pays("France", 66_000_000, "Europe");
		Pays pays2 = new Pays("France", 66_000_000, "Europe");
		
		if (pays1.equals(pays2)) {
			System.out.println("Les 2 pays sont identiques.");
		} else {
			System.out.println("Les 2 pays sont différents.");
		}
	}

}
