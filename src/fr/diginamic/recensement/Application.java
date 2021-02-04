package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Region;
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
				afficher10RegionsPlusPeuplees(recensement);
				break;
			case 5:
				afficher10DepartementsPlusPeuplees(recensement);
				break;
			case 6:

				break;
			case 7:

				break;
			case 8:
				afficher10VillesPlusPeuplees(recensement);
				break;
			}
		}
	}

	private static void afficher10VillesPlusPeuplees(Recensement recensement) {
		Collections.sort(recensement.getVilles());
		System.out.println("Les 10 villes de France les plus peuplées sont :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + recensement.getVilles().get(i).getPopTotale() + " Ville : "
					+ recensement.getVilles().get(i).getNomCommune());
		}
	}

	private static void afficher10DepartementsPlusPeuplees(Recensement recensement) {
		HashMap<String, Integer> mapDepartement = new HashMap<>();
		for (Ville ville : recensement.getVilles()) {
			if (!mapDepartement.containsKey(ville.getCodeDepartement())) {
				mapDepartement.put(ville.getCodeDepartement(), ville.getPopTotale());
			} else {
				mapDepartement.put(ville.getCodeDepartement(),
						mapDepartement.get(ville.getCodeDepartement()) + ville.getPopTotale());
			}
		}
		List<Departement> departements = new ArrayList<>();
		for (String codeDepartement : mapDepartement.keySet()) {
			departements.add(new Departement(codeDepartement, mapDepartement.get(codeDepartement)));
		}
		Collections.sort(departements);
		System.out.println("Les 10 départements les plus peuplés sont :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + departements.get(i).getPopulationTotale() + " Département : "
					+ departements.get(i).getCodeDepartement());
		}
	}

	private static void afficher10RegionsPlusPeuplees(Recensement recensement) {
		HashMap<String, Integer> mapRegion = new HashMap<>();
		for (Ville ville : recensement.getVilles()) {
			if (!mapRegion.containsKey(ville.getNomRegion())) {
				mapRegion.put(ville.getNomRegion(), ville.getPopTotale());
			} else {
				mapRegion.put(ville.getNomRegion(), mapRegion.get(ville.getNomRegion()) + ville.getPopTotale());
			}
		}
		List<Region> regions = new ArrayList<>();
		for (String nomRegion : mapRegion.keySet()) {
			regions.add(new Region(nomRegion, mapRegion.get(nomRegion)));
		}
		Collections.sort(regions);
		System.out.println("Les 10 régions les plus peuplées sont :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + regions.get(i).getPopulationTotale() + " Région : "
					+ regions.get(i).getNomRegion());
		}
	}

	private static void afficherPopulationRegion(Scanner scString, Recensement recensement) {
		System.out.println("Saisir le nom de la région dont vous souhaitez connaître la population :");
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
			System.out.println("Cette région n'est pas dans la liste.");
		}
	}

	private static void afficherPopulationDepartement(Scanner scString, Recensement recensement) {
		System.out.println("Saisir le code du département dont vous souhaitez connaître la population :");
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
			System.out.println("Ce département n'est pas dans la liste.");
		}
	}

	private static void afficherPopulationVille(Scanner scString, Recensement recensement) {
		System.out.println("Saisir le nom de la ville dont vous souhaitez connaître la population :");
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
