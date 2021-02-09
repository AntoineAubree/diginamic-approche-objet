package fr.diginamic.recensement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

/**
 * Permet d'afficher les 10 départements les plus peuplés d'un recensement
 * 
 * @author Antoine
 *
 */
public class Afficher10DepartementsPlusPeuplees implements MenuService {

	/**
	 * Prend en argument un Recensemeent et un objet de type Scanner.
	 * Affiche les 10 départements les plus peuplés du recensement.
	 */
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
		System.out.println("Les 10 d�partements les plus peupl�s sont :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + departements.get(i).getPopulationTotale() + " D�partement : "
					+ departements.get(i).getCodeDepartement());
		}
	}

}
