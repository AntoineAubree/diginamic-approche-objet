package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adresse01 = new AdressePostale();
		AdressePostale adresse02 = new AdressePostale();
		
		adresse01.numeroRue = 12;
		adresse01.codePostal = "35000";
		adresse01.libelleRue = "des fleurs";
		adresse01.ville = "Rennes";
		
		adresse02.numeroRue = 14;
		adresse02.codePostal = "44000";
		adresse02.libelleRue = "bof";
		adresse02.ville = "Nantes";
	}

}
