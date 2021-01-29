package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte01 = new Compte("18613951", 1_596.57D);
		CompteTaux compte02 = new CompteTaux("48846165", 3_632.42D, 1.5F);
		Compte[] tabComptes = {compte01, compte02};
		
		for (Compte compte : tabComptes) {
			System.out.println(compte);
		}
	}

}
