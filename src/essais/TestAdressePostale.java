package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adresse01 = new AdressePostale(12, "3500", "des fleurs", "Rennes");
		AdressePostale adresse02 = new AdressePostale(14, "44000", "bof", "Nantes");
		
		System.out.println(adresse01);
		System.out.println(adresse02);
		
	}

}
