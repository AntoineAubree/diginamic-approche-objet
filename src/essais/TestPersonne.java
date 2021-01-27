package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne personne01 = new Personne();
		Personne personne02 = new Personne();
		
		personne01.nom = "Aubree";
		personne01.prenom = "Antoine";
		personne01.adresse = new AdressePostale();
		
	}

}
