package fr.diginamic.cercle.utils;

import fr.diginamic.cercle.entities.Cercle;

public class CercleFactory {

	public static Cercle createCerlce(double rayon) {
		return new Cercle(rayon);
	}

}
