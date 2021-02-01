package fr.diginamic.theatrepro.essais;

import fr.diginamic.theatrepro.entities.Spectacle;
import fr.diginamic.theatrepro.entities.TheatrePro;

public class TestTheatrePro {

	public static void main(String[] args) {
		TheatrePro theatrePro = new TheatrePro("Le Grand Théâtre");
		theatrePro.ajouterSpectacle(new Spectacle("Johnny", "concert", 45.5, 150));
		theatrePro.ajouterSpectacle(new Spectacle("Joe le rigolo", "comédie", 25, 10));
		theatrePro.ajouterSpectacle(new Spectacle("Monsieur Mime", "improvisation", 12, 40));
		theatrePro.ajouterSpectacle(new Spectacle("H.I.P-H.O.P", "danse", 8.5, 30));

		System.out.println(theatrePro.getSpectacle("pas de spectacle"));
		System.out.println(theatrePro.getSpectacle("Johnny"));
		System.out.println(theatrePro.getSpectacle("Joe le rigolo"));
		System.out.println(theatrePro.getSpectacle("Monsieur Mime"));
		System.out.println(theatrePro.getSpectacle("H.I.P-H.O.P"));

		System.out.println("--------------------------------------------");

		System.out.println(theatrePro.getSpectacle("Joe le rigolo"));
		theatrePro.inscrire(5, "Joe le rigolo");
		theatrePro.inscrire(4, "Joe le rigolo");
		theatrePro.inscrire(4, "Joe le rigolo");
		theatrePro.inscrire(1, "Joe le rigolo");
		theatrePro.inscrire(1, "Joe le rigolo");
		theatrePro.inscrire(1, "pas de spectacle");
		
		theatrePro.inscrire(5, "Johnny");
		theatrePro.inscrire(40, "Johnny");
		theatrePro.inscrire(4, "H.I.P-H.O.P");
		
		System.out.println("--------------------------------------------");

		System.out.println("La recette totale de l'établissement est : " + theatrePro.getRecetteTotale());
		
		System.out.println("--------------------------------------------");

		System.out.println("Le nombre total de clients de l'établissement est : " + theatrePro.getNbTotalClients());

	}

}
