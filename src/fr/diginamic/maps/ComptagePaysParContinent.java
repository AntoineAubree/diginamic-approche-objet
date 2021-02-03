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

		HashMap<String, Integer> continent = new HashMap<>();
		for (int i = 0; i < mesPays.size(); i++) {
			//TODO finir le TP
//			if (continent.get(mesPays.get(i).getContinent()) == 0) {
//				continent.put(mesPays.get(i).getContinent(), 1);
//			}
		}
		
		afficherMap(continent);
	}
	
	private static void afficherMap(HashMap<String, Integer> nbPays) {
		Iterator<Integer> iterContinentValues = nbPays.values().iterator();
		while (iterContinentValues.hasNext()) {
			System.out.println(iterContinentValues.next());
		}
		System.out.println("------------------------------");
	}

}
