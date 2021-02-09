package fr.diginamic.recensement.service;

import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;

/**
 * Permet d'afficher les 10 villes les plus peuplées d'un recensement
 * 
 * @author Antoine
 *
 */
public class Afficher10VillesPlusPeuplees implements MenuService {

	/**
	 * Prend en argument un Recensemeent et un objet de type Scanner.
	 * Affiche les 10 villes les plus peuplées du recensement.
	 */
	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		Collections.sort(recensement.getVilles());
		System.out.println("Les 10 villes de France les plus peupl�es sont :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + recensement.getVilles().get(i).getPopTotale() + " Ville : "
					+ recensement.getVilles().get(i).getNomCommune());
		}
	}

}
