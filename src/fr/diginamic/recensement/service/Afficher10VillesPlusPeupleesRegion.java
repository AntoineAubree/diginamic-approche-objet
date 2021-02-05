package fr.diginamic.recensement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

public class Afficher10VillesPlusPeupleesRegion implements MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		System.out
				.println("Saisir le nom de la région dont vous souhaitez connaître les 10 villes les plus peuplées :");
		String nomRegion = sc.nextLine().toLowerCase();
		List<Ville> villesRegion = new ArrayList<>();
		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomRegion().equals(nomRegion)) {
				villesRegion.add(ville);
			}
		}
		Collections.sort(villesRegion);
		System.out.println("Les 10 villes les plus peuplées de la région " + nomRegion);
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + villesRegion.get(i).getPopTotale() + " Ville : "
					+ villesRegion.get(i).getNomCommune());
		}
	}

}
