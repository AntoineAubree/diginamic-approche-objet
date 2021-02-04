package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;

public class Application {

	public static void main(String[] args) throws IOException {
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		int choixUtilisateur = 0;
		Recensement recensement = recupererRecensement();
		while (choixUtilisateur != 9) {
			choixUtilisateur = choisirAffichage(scInt, choixUtilisateur);
			switch (choixUtilisateur) {
			case 1:
				afficherPopulationVille(scString, recensement);
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			}
		}
	}

	private static void afficherPopulationVille(Scanner scString, Recensement recensement) {
		System.out.println("Saisir le nom de la ville dont vous souhaitez connaître la population :");
		String nomVilleRecherchee = scString.nextLine();
		nomVilleRecherchee = formaterNomVille(nomVilleRecherchee);
		Ville villeRecherchee = null;
		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomCommune().equals(nomVilleRecherchee)) {
				villeRecherchee = ville;
				break;
			}
		}
		if (villeRecherchee != null) {
			System.out.println(nomVilleRecherchee + ", populaion : " + villeRecherchee.getPopTotale() + " habitants");
		} else {
			System.out.println("Cette ville n'est pas dans la liste.");
		}
	}

	private static String formaterNomVille(String nom) {
		nom = nom.substring(0, 1).toUpperCase() + nom.substring(1).toLowerCase();
		return nom;
	}

	private static Recensement recupererRecensement() throws IOException {
		Recensement recensement = new Recensement();
		Path pathRecensement = Paths.get(
				"E:/Formation/2020-2021 - Diginamic/Cours/Langage Java/Approche objet/J7 _ J8 - TP/recensement.csv");
		List<String> villes = Files.readAllLines(pathRecensement);
		for (int i = 1; i < villes.size(); i++) {
			String[] morceaux = villes.get(i).split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			int population = Integer.parseInt(morceaux[7].trim().replaceAll(" ", ""));
			recensement.getVilles()
					.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population));
		}
		return recensement;
	}

	private static int choisirAffichage(Scanner sc, int choixUtilisateur) {
		choixUtilisateur = 0;
		while (choixUtilisateur < 1 || choixUtilisateur > 9) {
			afficherMenu();
			choixUtilisateur = sc.nextInt();
			if (choixUtilisateur < 1 || choixUtilisateur > 9) {
				System.out.println("Ce choix n'est pas valide");
			}
		}
		return choixUtilisateur;
	}

	private static void afficherMenu() {
		System.out.println("1 - Population d'une ville donnée");
		System.out.println("2 - Population d’un département donné");
		System.out.println("3 - Population d’une région donnée");
		System.out.println("4 - Afficher les 10 régions les plus peuplées");
		System.out.println("5 - Afficher les 10 départements les plus peuplés");
		System.out.println("6 - Afficher les 10 villes les plus peuplées d’un département");
		System.out.println("7 - Afficher les 10 villes les plus peuplées d’une région");
		System.out.println("8 - Afficher les 10 villes les plus peuplées de France");
		System.out.println("9 - Sortir");
	}

}
