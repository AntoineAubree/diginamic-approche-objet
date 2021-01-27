package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adresse01 = new AdressePostale(12, "3500", "des fleurs", "Rennes");
		AdressePostale adresse02 = new AdressePostale(14, "44000", "bof", "Nantes");

		Personne personne01 = new Personne("Aubree", "Antoine");
		personne01.adressePostale = adresse01;

		Personne personne02 = new Personne("L'asticot", "Coco", adresse02);

		System.out.println(personne01);
		System.out.println(personne02);
	}

}
