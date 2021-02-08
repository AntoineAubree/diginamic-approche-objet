/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Antoine
 *
 */
public class TestDates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Cr�er une instance � la date du jour
		Date dateDuJour = new Date();
		// Afficher l'instance au format jour/mois/ann�e
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
		System.out.println(dateFormat.format(dateDuJour));
		// Cr�er une instance � la date du 19 mai 2016 � 23h59 et 30 secondes
		@SuppressWarnings("deprecation")
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		// Afficher l'instance au format jour/mois/ann�e heure:minuste:seconde
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
		System.out.println(dateFormat2.format(date2));
		// Cr�er et afficher la date/heure système
		Date date3 = new Date();
		System.out.println(dateFormat2.format(date3));
		
	}

}
