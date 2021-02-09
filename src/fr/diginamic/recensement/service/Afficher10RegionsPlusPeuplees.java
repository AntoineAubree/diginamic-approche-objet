package fr.diginamic.recensement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Region;
import fr.diginamic.recensement.entities.Ville;

/**
 * Permet d'afficher les 10 régions les plus peuplées d'un recensement
 * 
 * @author Antoine
 *
 */
public class Afficher10RegionsPlusPeuplees implements MenuService {

	/**
	 * Prend en argument un Recensemeent et un objet de type Scanner.
	 * Affiche les 10 régions les plus peuplées du recensement.
	 */
	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		HashMap<String, Region> mapRegion = new HashMap<>();
		List<Region> regions = new ArrayList<>();
		for (Ville ville : recensement.getVilles()) {
			String nomRegion = ville.getNomRegion();
			int codeRegion = ville.getCodeRegion();
			int population = ville.getPopTotale();
			if (!mapRegion.containsKey(nomRegion)) {
				mapRegion.put(nomRegion, new Region(nomRegion, codeRegion, population));
				regions.add(mapRegion.get(nomRegion));
			} else {
				mapRegion.get(nomRegion)
						.setPopulationTotale(mapRegion.get(nomRegion).getPopulationTotale() + population);
			}
		}
		Collections.sort(regions);
		System.out.println("Les 10 r�gions les plus peupl�es sont :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + regions.get(i).getPopulationTotale() + " R�gion : "
					+ regions.get(i).getNomRegion());
		}

	}

}
