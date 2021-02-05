package fr.diginamic.recensement.service;

import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

public class AfficherPopulationDepartement implements MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		System.out.println("Saisir le code du département dont vous souhaitez connaître la population :");
		String codeDepartementRecherche = sc.nextLine().toLowerCase();
		int populationDepartement = 0;
		for (Ville ville : recensement.getVilles()) {
			if (ville.getCodeDepartement().equals(codeDepartementRecherche)) {
				populationDepartement += ville.getPopTotale();
			}
		}
		if (populationDepartement != 0) {
			System.out.println("Département : " + codeDepartementRecherche + ", populaion : " + populationDepartement
					+ " habitants");
		} else {
			System.out.println("Ce département n'est pas dans la liste.");
		}
	}

}
