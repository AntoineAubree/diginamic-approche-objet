package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;
import fr.diginamic.recensement.service.Afficher10DepartementsPlusPeuplees;
import fr.diginamic.recensement.service.Afficher10RegionsPlusPeuplees;
import fr.diginamic.recensement.service.Afficher10VillesPlusPeuplees;
import fr.diginamic.recensement.service.Afficher10VillesPlusPeupleesDepartement;
import fr.diginamic.recensement.service.Afficher10VillesPlusPeupleesRegion;
import fr.diginamic.recensement.service.AfficherPopulationDepartement;
import fr.diginamic.recensement.service.AfficherPopulationRegion;
import fr.diginamic.recensement.service.AfficherPopulationVille;

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
				AfficherPopulationVille afficherPopulationVille = new AfficherPopulationVille();
				afficherPopulationVille.traiter(recensement, scString);
				break;
			case 2:
				AfficherPopulationDepartement afficherPopulationDepartement = new AfficherPopulationDepartement();
				afficherPopulationDepartement.traiter(recensement, scString);
				break;
			case 3:
				AfficherPopulationRegion afficherPopulationRegion = new AfficherPopulationRegion();
				afficherPopulationRegion.traiter(recensement, scString);
				break;
			case 4:
				Afficher10RegionsPlusPeuplees afficher10RegionsPlusPeuplees = new Afficher10RegionsPlusPeuplees();
				afficher10RegionsPlusPeuplees.traiter(recensement, scString);
				break;
			case 5:
				Afficher10DepartementsPlusPeuplees afficher10DepartementsPlusPeuplees = new Afficher10DepartementsPlusPeuplees();
				afficher10DepartementsPlusPeuplees.traiter(recensement, scString);
				break;
			case 6:
				Afficher10VillesPlusPeupleesDepartement afficher10VillesPlusPeupleesDepartement = new Afficher10VillesPlusPeupleesDepartement();
				afficher10VillesPlusPeupleesDepartement.traiter(recensement, scString);
				break;
			case 7:
				Afficher10VillesPlusPeupleesRegion afficher10VillesPlusPeupleesRegion = new Afficher10VillesPlusPeupleesRegion();
				afficher10VillesPlusPeupleesRegion.traiter(recensement, scString);
				break;
			case 8:
				Afficher10VillesPlusPeuplees afficher10VillesPlusPeuplees = new Afficher10VillesPlusPeuplees();
				afficher10VillesPlusPeuplees.traiter(recensement, scString);
				break;
			}
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
