package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adresse01 = new AdressePostale();
		
		adresse01.numeroRue = 12;
		adresse01.codePostal = "35000";
		adresse01.libelleRue = "des fleurs";
		adresse01.ville = "Rennes";
		
		Personne personne01 = new Personne();
		
		personne01.nom = "Aubree";
		personne01.prenom = "Antoine";
		personne01.adressePostale = adresse01;
		
		AdressePostale adresse02 = new AdressePostale();
		
		adresse02.numeroRue = 14;
		adresse02.codePostal = "44000";
		adresse02.libelleRue = "bof";
		adresse02.ville = "Nantes";
		
		Personne personne02 = new Personne();
		
		personne02.nom = "L'asticot";
		personne02.prenom = "Coco";
		personne02.adressePostale = adresse02;
		
	}

}
