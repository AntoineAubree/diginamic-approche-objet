package fr.diginamic.recensement.service;

import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

/**
 * Permet d'afficher la population d'une ville
 * 
 * @author Antoine
 *
 */
public class AfficherPopulationVille implements MenuService {

	/**
	 * Prend en argument un Recensemeent et un objet de type Scanner.
	 * Affiche la population d'une des villes du recensement en fonction du nom de la ville.
	 */
	@Override
	public void traiter(Recensement recensement, Scanner sc) {
		System.out.println("Saisir le nom de la ville dont vous souhaitez conna�tre la population :");
		String nomVilleRecherchee = sc.nextLine().toLowerCase();
		int populationVille = 0;
		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomCommune().equals(nomVilleRecherchee)) {
				populationVille = ville.getPopTotale();
				break;
			}
		}
		if (populationVille != 0) {
			System.out.println(nomVilleRecherchee + ", populaion : " + populationVille + " habitants");
		} else {
			System.out.println("Cette ville n'est pas dans la liste.");
		}
	}

}
