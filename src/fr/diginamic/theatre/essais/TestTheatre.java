package fr.diginamic.theatre.essais;

import fr.diginamic.theatre.entities.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre monTheatre = new Theatre("Le Tout Petit Théatre", 15);
		
		monTheatre.inscrire(4, 8.5);
		monTheatre.inscrire(4, 8.5);
		monTheatre.inscrire(1, 8.5);
		monTheatre.inscrire(4, 8.5);
		monTheatre.inscrire(3, 8.5);
		monTheatre.inscrire(2, 8.5);
		monTheatre.inscrire(2, 8.5);
		
		System.out.println("----------------------------------------");
		
		System.out.println("Il y a  " + monTheatre.getTotalCLient() + " clients inscrits.");
		System.out.println("La recette totale est de " + monTheatre.getRecetteTotale() + " euros.");
		
	}

}
