package fr.diginamic.recensement.service;

import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

public class AfficherPopulationDepartement implements MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		System.out.println("Saisir le code du d�partement dont vous souhaitez conna�tre la population :");
		String codeDepartementRecherche = sc.nextLine().toLowerCase();
		int populationDepartement = 0;
		for (Ville ville : recensement.getVilles()) {
			if (ville.getCodeDepartement().equals(codeDepartementRecherche)) {
				populationDepartement += ville.getPopTotale();
			}
		}
		if (populationDepartement != 0) {
			System.out.println("D�partement : " + codeDepartementRecherche + ", populaion : " + populationDepartement
					+ " habitants");
		} else {
			System.out.println("Ce d�partement n'est pas dans la liste.");
		}
	}

}
