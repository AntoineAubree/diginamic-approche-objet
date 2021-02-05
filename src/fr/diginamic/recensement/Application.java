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
				afficher10VillesPlusPeupleesDepartement(scString, recensement);
				break;
			case 7:
				afficher10VillesPlusPeupleesRegion(scString, recensement);
				break;
			case 8:
				afficher10VillesPlusPeuplees(recensement);
				break;
			}
		}
	}

	private static void afficher10VillesPlusPeupleesRegion(Scanner scString, Recensement recensement) {
		System.out
				.println("Saisir le nom de la r�gion dont vous souhaitez conna�tre les 10 villes les plus peupl�es :");
		String nomRegion = scString.nextLine().toLowerCase();
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

	private static void afficher10VillesPlusPeupleesDepartement(Scanner scString, Recensement recensement) {
		System.out.println(
				"Saisir le code du d�partement dont vous souhaitez conna�tre les 10 villes les plus peupl�es :");
		String codeDepartementRecherche = scString.nextLine().toLowerCase();
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

	private static void afficher10VillesPlusPeuplees(Recensement recensement) {
		Collections.sort(recensement.getVilles());
		System.out.println("Les 10 villes de France les plus peupl�es sont :");
		for (int i = 0; i < 10; i++) {
			System.out.println("Population : " + recensement.getVilles().get(i).getPopTotale() + " Ville : "
					+ recensement.getVilles().get(i).getNomCommune());
		}
	}

	private static void afficher10DepartementsPlusPeuplees(Recensement recensement) {
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

	private static void afficher10RegionsPlusPeuplees(Recensement recensement) {
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
			int codeRegion = Integer.parseInt(morceaux[0]);
			String nomRegion = morceaux[1].toLowerCase();
			String codeDepartement = morceaux[2].toLowerCase();
			if (codeDepartement.charAt(0) == '0') {
				codeDepartement = codeDepartement.trim().replaceAll("0", "");
			}
			int codeCommune = Integer.parseInt(morceaux[5]);
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
