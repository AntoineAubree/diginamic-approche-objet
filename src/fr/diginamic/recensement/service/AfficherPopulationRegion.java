package fr.diginamic.recensement.service;

import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

public class AfficherPopulationRegion implements MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		System.out.println("Saisir le nom de la région dont vous souhaitez connaître la population :");
		String nomRegionRecherchee = sc.nextLine().toLowerCase();
		int populationRegion = 0;
		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomRegion().equals(nomRegionRecherchee)) {
				populationRegion += ville.getPopTotale();
			}
		}
		if (populationRegion != 0) {
			System.out.println("Région : " + nomRegionRecherchee + ", populaion : " + populationRegion + " habitants");
		} else {
			System.out.println("Cette région n'est pas dans la liste.");
		}
	}

}
