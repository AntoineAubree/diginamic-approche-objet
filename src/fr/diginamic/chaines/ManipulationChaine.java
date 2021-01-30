package fr.diginamic.chaines;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		System.out.println("Premier caractère : " + chaine.charAt(0));
		System.out.println("Longueur de la chaîne de caractères : " + chaine.length());
		System.out.println("Index du premier \";\" : " + chaine.indexOf(";"));
		System.out.println("Nom de famille : " + chaine.substring(0, chaine.indexOf(";")));
		System.out.println("Nom de famille en majuscule : " + chaine.substring(0, chaine.indexOf(";")).toUpperCase());
		System.out.println("Nom de famille en minuscule : " + chaine.substring(0, chaine.indexOf(";")).toLowerCase());
	}

}
