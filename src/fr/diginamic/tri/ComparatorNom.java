package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.tri.entities.Ville;

public class ComparatorNom implements Comparator<Ville> {

	@Override
	public int compare(Ville ville1, Ville ville2) {
		return ville1.getNom().compareTo(ville2.getNom());
	}

}
