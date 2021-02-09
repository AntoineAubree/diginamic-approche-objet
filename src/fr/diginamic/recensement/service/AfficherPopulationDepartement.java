package fr.diginamic.recensement.service;

import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

/**
 * Permet d'afficher la population d'un département
 * 
 * @author Antoine
 *
 */
public class AfficherPopulationDepartement implements MenuService {

	/**
	 * Prend en argument un Recensemeent et un objet de type Scanner.
	 * Affiche la population d'un des département du recensement en fonction du code département.
	 */
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
