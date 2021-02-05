package fr.diginamic.recensement.service;

import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;

public class Afficher10VillesPlusPeuplees implements MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		Collections.sort(recensement.getVilles());
		System.out.println("Les 10 villes de France les plus peuplées sont :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + recensement.getVilles().get(i).getPopTotale() + " Ville : "
					+ recensement.getVilles().get(i).getNomCommune());
		}
	}

}
