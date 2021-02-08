/**
 * 
 */
package fr.diginamic.stringbuilder;

/**
 * @author Antoine
 *
 */
public class TestStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long debut = System.currentTimeMillis(); 
		StringBuilder builder = new StringBuilder();
		for (int i = 0 ; i< 100_000; i++) {
			builder.append(i);
		}
		@SuppressWarnings("unused")
		String s = builder.toString();
		long fin = System.currentTimeMillis(); 
		System.out.println("Temps écoulé en millisecondes : " + (fin - debut));

		long debut2 = System.currentTimeMillis(); 
		@SuppressWarnings("unused")
		String s2 = "";
		for (int i = 0 ; i< 100_000; i++) {
			s2 += i;
		}
		long fin2 = System.currentTimeMillis(); 
		System.out.println("Temps écoulé en millisecondes : " + (fin2 - debut2));
	}

}
