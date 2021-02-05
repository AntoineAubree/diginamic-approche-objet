package fr.diginamic.recensement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

public class Afficher10DepartementsPlusPeuplees implements MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		HashMap<String, Departement> mapDepartement = new HashMap<>();
		List<Departement> departements = new ArrayList<>();
		for (Ville ville : recensement.getVilles()) {
			String codeDepartement = ville.getCodeDepartement();
			int population = ville.getPopTotale();
			if (!mapDepartement.containsKey(codeDepartement)) {
				mapDepartement.put(codeDepartement, new Departement(codeDepartement, population));
				departements.add(mapDepartement.get(codeDepartement));
			} else {
				mapDepartement.get(codeDepartement)
						.setPopulationTotale(mapDepartement.get(codeDepartement).getPopulationTotale() + population);
			}
		}
		Collections.sort(departements);
		System.out.println("Les 10 départements les plus peuplés sont :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + departements.get(i).getPopulationTotale() + " Département : "
					+ departements.get(i).getCodeDepartement());
		}
	}

}
