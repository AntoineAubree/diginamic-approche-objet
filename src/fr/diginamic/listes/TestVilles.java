package fr.diginamic.listes;

import java.util.ArrayList;

import fr.diginamic.listes.entities.Ville;

public class TestVilles {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>();

		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Foix", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));

		// Afficher la ville la plus peuplée
		System.out.println("-------------------------------------------");
		int indexVillePlusPeuplee = 0;
		if (!villes.isEmpty()) {
			for (int i = 0; i < villes.size(); i++) {
				if (villes.get(i).getNbHab() > villes.get(indexVillePlusPeuplee).getNbHab()) {
					indexVillePlusPeuplee = i;
				}
			}
			System.out.println("Ville la plus peuplée : " + villes.get(indexVillePlusPeuplee));
		} else {
			System.out.println("La liste est vide");
		}

		// Supprimer la ville la moins peuplée
		System.out.println("-------------------------------------------");
		int indexVilleMoinsPeuplee = 0;
		if (!villes.isEmpty()) {
			for (int i = 0; i < villes.size(); i++) {
				if (villes.get(i).getNbHab() < villes.get(indexVilleMoinsPeuplee).getNbHab()) {
					indexVilleMoinsPeuplee = i;
				}
			}
			System.out.println(
					"Ville la moins peuplée : " + villes.get(indexVilleMoinsPeuplee) + " est supprimée de la liste");
			villes.remove(indexVilleMoinsPeuplee);
		} else {
			System.out.println("La liste est vide");
		}

		// Mettre en majuscules les villes de plus de 100_000 habitants
		System.out.println("-------------------------------------------");
		if (!villes.isEmpty()) {
			for (int i = 0; i < villes.size(); i++) {
				if (villes.get(i).getNbHab() > 100_000) {
					villes.set(i, new Ville(villes.get(i).getNom().toUpperCase(), villes.get(i).getNbHab()));
				}
			}
			for (Ville ville : villes) {
				System.out.println(ville);
			}
		} else {
			System.out.println("La liste est vide");
		}
	}

}
