/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Antoine
 *
 */
public class TestCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Créer une instance de date à une date précise
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 4, 19, 23, 59, 30);
		Date date1 = cal1.getTime();
		// Afficher l'instance au format jour/mois/année
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
		System.out.println(dateFormat.format(date1));
		// Créer une instance de date à la date du jour
		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		// Afficher l'instance au format jour/mois/année heure:minute:seconde
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
		System.out.println(dateFormat2.format(date2));
		SimpleDateFormat dateFormatFr = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
		System.out.println(dateFormatFr.format(date2));
		SimpleDateFormat dateFormatRu = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru", "RU"));
		System.out.println(dateFormatRu.format(date2));
		SimpleDateFormat dateFormatCh = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINA);
		System.out.println(dateFormatCh.format(date2));
		SimpleDateFormat dateFormatAl = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);
		System.out.println(dateFormatAl.format(date2));
	}

}
