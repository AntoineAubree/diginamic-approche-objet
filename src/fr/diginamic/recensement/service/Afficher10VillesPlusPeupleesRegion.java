package fr.diginamic.recensement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

/**
 * Permet d'afficher les 10 villes les plus peuplées d'une région
 * 
 * @author Antoine
 *
 */
public class Afficher10VillesPlusPeupleesRegion implements MenuService {

	/**
	 * Prend en argument un Recensemeent et un objet de type Scanner.
	 * Affiche les 10 villes les plus peuplées d'un des régions du recensement.
	 */
	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		System.out
				.println("Saisir le nom de la r�gion dont vous souhaitez conna�tre les 10 villes les plus peupl�es :");
		String nomRegion = sc.nextLine().toLowerCase();
		List<Ville> villesRegion = new ArrayList<>();
		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomRegion().equals(nomRegion)) {
				villesRegion.add(ville);
			}
		}
		Collections.sort(villesRegion);
		System.out.println("Les 10 villes les plus peupl�es de la r�gion " + nomRegion);
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + villesRegion.get(i).getPopTotale() + " Ville : "
					+ villesRegion.get(i).getNomCommune());
		}
	}

}
