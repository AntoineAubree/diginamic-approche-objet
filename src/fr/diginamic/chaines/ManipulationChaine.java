package fr.diginamic.chaines;

import fr.diginamic.chaines.entities.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		System.out.println("Premier caractère : " + chaine.charAt(0));
		System.out.println("Longueur de la chaîne de caractères : " + chaine.length());
		System.out.println("Index du premier \";\" : " + chaine.indexOf(";"));
		System.out.println("Nom de famille : " + chaine.substring(0, chaine.indexOf(";")));
		System.out.println("Nom de famille en majuscule : " + chaine.substring(0, chaine.indexOf(";")).toUpperCase());
		System.out.println("Nom de famille en minuscule : " + chaine.substring(0, chaine.indexOf(";")).toLowerCase());
		String[] tabSalarie01 = chaine.split(";");
		for (int i = 0 ; i< tabSalarie01.length; i++) {
			System.out.println(tabSalarie01[i]);
		}
		Salarie salarie01 = new Salarie(tabSalarie01[0], tabSalarie01[1], Double.parseDouble(tabSalarie01[2].replace(" ", "")));
		System.out.println(salarie01.toString());
	}

}
