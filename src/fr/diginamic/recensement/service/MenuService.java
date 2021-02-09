package fr.diginamic.recensement.service;

import java.util.Scanner;

import fr.diginamic.recensement.entities.Recensement;

public interface MenuService {

	/**
	 * @param recensement Recensement
	 * @param sc Scanner
	 */
	public abstract void traiter(Recensement recensement, Scanner sc);

}
