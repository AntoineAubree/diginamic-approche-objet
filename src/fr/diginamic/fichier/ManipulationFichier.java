package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		// Récupérer le path du fichier
		Path pathRecensement = Paths
				.get("E:/Formation/2020-2021 - Diginamic/Cours/Langage Java/Approche objet/J5 _ J6/TP/recensement.csv");
		// Lire le contenu du fichier
		List<String> villes = Files.readAllLines(pathRecensement);
		for (String ville : villes) {
			System.out.println(ville);
		}
		// Créer le fichier cible
		Path pathRecensementSup25 = Paths.get(
				"E:/Formation/2020-2021 - Diginamic/Cours/Langage Java/Approche objet/J5 _ J6/TP/recensement_sup_25000.csv");
		if (!Files.exists(pathRecensementSup25)) {
			Files.createFile(pathRecensementSup25);
		}
		// Créer la liste contenant les villes de plus de 25k habitants
		List<String> villesSup25k = new ArrayList<>();
		// Récupérer les noms de colonnes
		String[] nomsColonnes = villes.get(0).split(";");
		villesSup25k.add(nomsColonnes[1] + ";" + nomsColonnes[2] + ";" + nomsColonnes[7]);
		// Récupérer les villes de plus de 25_000 habitants
		for (int i = 1; i < villes.size(); i++) {
			String ville = villes.get(i);
			String[] tokens = ville.split(";");
			tokens[7] = tokens[7].trim().replaceAll(" ", "");
			if (Integer.parseInt(tokens[7]) >= 25_000) {
				villesSup25k.add(tokens[1] + ";" + tokens[2] + ";" + tokens[7]);
			}
		}
		// Remplire le fichier cible
		Files.write(pathRecensementSup25, villesSup25k);
	}

}
