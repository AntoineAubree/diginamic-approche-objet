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
				afficherPopulationDepartement(scString, recensement);
				break;
			case 3:
				afficherPopulationRegion(scString, recensement);
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
	
	private static void afficherPopulationRegion(Scanner scString, Recensement recensement) {
		System.out.println("Saisir le nom de la r�gion dont vous souhaitez conna�tre la population :");
		String nomRegionRecherchee = scString.nextLine().toLowerCase();
		int populationRegion = 0;
		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomRegion().equals(nomRegionRecherchee)) {
				populationRegion += ville.getPopTotale();
			}
		}
		if (populationRegion != 0) {
			System.out.println(nomRegionRecherchee + ", populaion : " + populationRegion + " habitants");
		} else {
			System.out.println("Cette r�gion n'est pas dans la liste.");
		}
	}

	private static void afficherPopulationDepartement(Scanner scString, Recensement recensement) {
		System.out.println("Saisir le code du d�partement dont vous souhaitez conna�tre la population :");
		String codeDepartementRecherche = scString.nextLine().toLowerCase();
		int populationDepartement = 0;
		for (Ville ville : recensement.getVilles()) {
			if (ville.getCodeDepartement().equals(codeDepartementRecherche)) {
				populationDepartement += ville.getPopTotale();
			}
		}
		if (populationDepartement != 0) {
			System.out.println(codeDepartementRecherche + ", populaion : " + populationDepartement + " habitants");
		} else {
			System.out.println("Ce d�partement n'est pas dans la liste.");
		}
	}
	
	private static void afficherPopulationVille(Scanner scString, Recensement recensement) {
		System.out.println("Saisir le nom de la ville dont vous souhaitez conna�tre la population :");
		String nomVilleRecherchee = scString.nextLine().toLowerCase();
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

	private static Recensement recupererRecensement() throws IOException {
		Recensement recensement = new Recensement();
		Path pathRecensement = Paths.get(
				"E:/Formation/2020-2021 - Diginamic/Cours/Langage Java/Approche objet/J7 _ J8 - TP/recensement.csv");
		List<String> villes = Files.readAllLines(pathRecensement);
		for (int i = 1; i < villes.size(); i++) {
			String[] morceaux = villes.get(i).split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1].toLowerCase();
			String codeDepartement = morceaux[2].toLowerCase();
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6].toLowerCase();
			int population = Integer.parseInt(morceaux[9].trim().replaceAll(" ", ""));
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
		System.out.println("1 - Population d'une ville donn�e");
		System.out.println("2 - Population d�un d�partement donn�");
		System.out.println("3 - Population d�une r�gion donn�e");
		System.out.println("4 - Afficher les 10 r�gions les plus peupl�es");
		System.out.println("5 - Afficher les 10 d�partements les plus peupl�s");
		System.out.println("6 - Afficher les 10 villes les plus peupl�es d�un d�partement");
		System.out.println("7 - Afficher les 10 villes les plus peupl�es d�une r�gion");
		System.out.println("8 - Afficher les 10 villes les plus peupl�es de France");
		System.out.println("9 - Sortir");
	}

}
