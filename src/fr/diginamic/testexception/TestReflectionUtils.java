/**
 * 
 */
package fr.diginamic.testexception;

import fr.diginamic.testexception.entities.Ville;

/**
 * @author Antoine
 *
 */
public class TestReflectionUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ville ville1 = new Ville("Rennes", 250_000);
		
		try {
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ReflectionException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
