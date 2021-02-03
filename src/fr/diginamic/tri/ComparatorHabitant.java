package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.tri.entities.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville ville1, Ville ville2) {
		if (ville1.getNbHab() > ville2.getNbHab()) {
			return 1;
		} else if (ville1.getNbHab() < ville2.getNbHab()) {
			return -1;
		} else {
			return 0;
		}
	}

}
