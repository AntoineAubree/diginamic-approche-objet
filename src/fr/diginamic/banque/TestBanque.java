package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte01 = new Compte(2_489_645L, 1_596.57F);
		System.out.println(compte01);
	}

}
