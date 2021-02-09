package fr.diginamic.recensement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

/**
 * Permet d'afficher les 10 villes les plus peuplées d'un département
 * 
 * @author Antoine
 *
 */
public class Afficher10VillesPlusPeupleesDepartement implements MenuService {

	/**
	 * Prend en argument un Recensemeent et un objet de type Scanner.
	 * Affiche les 10 villes les plus peuplées d'un des départements du recensement.
	 */
	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		System.out.println(
				"Saisir le code du d�partement dont vous souhaitez conna�tre les 10 villes les plus peupl�es :");
		String codeDepartementRecherche = sc.nextLine().toLowerCase();
		List<Ville> villesDepartement = new ArrayList<>();
		for (Ville ville : recensement.getVilles()) {
			if (ville.getCodeDepartement().equals(codeDepartementRecherche)) {
				villesDepartement.add(ville);
			}
		}
		Collections.sort(villesDepartement);
		if (villesDepartement.size() >= 10) {
			System.out.println("Les 10 villes les plus peupl�es du d�partement " + codeDepartementRecherche);
			for (int i = 0; i < 10; i++) {
				System.out.println("Population : " + villesDepartement.get(i).getPopTotale() + " Ville : "
						+ villesDepartement.get(i).getNomCommune());
			}
		} else {
			System.out.println("Les villes les plus peupl�es du d�partement " + codeDepartementRecherche);
			for (int i = 0; i < villesDepartement.size(); i++) {
				System.out.println("Population : " + villesDepartement.get(i).getPopTotale() + " Ville : "
						+ villesDepartement.get(i).getNomCommune());
			}
		}
	}

}
