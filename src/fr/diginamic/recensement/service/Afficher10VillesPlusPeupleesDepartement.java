package fr.diginamic.recensement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

public class Afficher10VillesPlusPeupleesDepartement implements MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		System.out.println(
				"Saisir le code du département dont vous souhaitez connaître les 10 villes les plus peuplées :");
		String codeDepartementRecherche = sc.nextLine().toLowerCase();
		List<Ville> villesDepartement = new ArrayList<>();
		for (Ville ville : recensement.getVilles()) {
			if (ville.getCodeDepartement().equals(codeDepartementRecherche)) {
				villesDepartement.add(ville);
			}
		}
		Collections.sort(villesDepartement);
		if (villesDepartement.size() >= 10) {
			System.out.println("Les 10 villes les plus peuplées du département " + codeDepartementRecherche);
			for (int i = 0; i < 10; i++) {
				System.out.println("Population : " + villesDepartement.get(i).getPopTotale() + " Ville : "
						+ villesDepartement.get(i).getNomCommune());
			}
		} else {
			System.out.println("Les villes les plus peuplées du département " + codeDepartementRecherche);
			for (int i = 0; i < villesDepartement.size(); i++) {
				System.out.println("Population : " + villesDepartement.get(i).getPopTotale() + " Ville : "
						+ villesDepartement.get(i).getNomCommune());
			}
		}
	}

}
