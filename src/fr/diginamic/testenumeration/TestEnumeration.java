/**
 * 
 */
package fr.diginamic.testenumeration;

import java.util.Scanner;

/**
 * @author Antoine
 *
 */
public class TestEnumeration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (Saison saison : Saison.values()) {
			System.out.println(saison);
		}

		System.out.println("----------------------------");
		String nom = "ETE";
		StringBuilder builder = new StringBuilder();
		builder.append("Libbellé de la saison dont le nom est ");
		builder.append(nom);
		builder.append(", est ");
		builder.append(Saison.valueOf(nom).getLibelle());
		System.out.println(builder);

		System.out.println("----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le libellé de la saison dont vous souhaitez réupérér l'instance. (Première lettre en majuscule)");
		String libelle = sc.nextLine();
		try {
			System.out.println(Saison.getInstance(libelle));
		} catch (BadLibelleException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
