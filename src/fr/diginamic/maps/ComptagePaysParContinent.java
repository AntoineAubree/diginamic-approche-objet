package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.maps.entities.Pays;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		ArrayList<Pays> mesPays = new ArrayList<>();
		mesPays.add(new Pays("France", 65_000_000L, "Europe"));
		mesPays.add(new Pays("Allemagne", 80_000_000L, "Europe"));
		mesPays.add(new Pays("Belgique,", 10_000_000L, "Europe"));
		mesPays.add(new Pays("Russie", 150_000_000L, "Asie"));
		mesPays.add(new Pays("Chine", 1_400_000_000L, "Asie"));
		mesPays.add(new Pays("Indonésie", 220_000_000L, "Océanie"));
		mesPays.add(new Pays("Australie", 20_000_000L, "Océanie"));

		HashMap<String, Integer> mapContinents = creerMapNbPaysParContinent(mesPays);
		afficherMap(mapContinents);
	}

	private static HashMap<String, Integer> creerMapNbPaysParContinent(ArrayList<Pays> mesPays) {
		HashMap<String, Integer> mapContinents = new HashMap<>();
		for (int i = 0; i < mesPays.size(); i++) {
			String continent = mesPays.get(i).getContinent();
			if (!mapContinents.containsKey(continent)) {
				mapContinents.put(continent, 1);
			} else {
				mapContinents.put(continent, mapContinents.get(continent) + 1);
			}
		}
		return mapContinents;
	}
	
	private static void afficherMap(HashMap<String, Integer> continents) {
		Iterator<String> iterContinentCle = continents.keySet().iterator();
		while (iterContinentCle.hasNext()) {
			String cle = iterContinentCle.next();
			System.out.println(cle + " nombre de pays : "+ continents.get(cle));
		}
		System.out.println("------------------------------");
	}

}
