package fr.diginamic.jdr;

public class Launcher {

	public static void main(String[] args) {
		int userChoice = 0;
		while (userChoice!=4) {
			showMenu();
		}
	}

	private static void showMenu() {
		System.out.println("1 - Cr�er un nouveau personnage");
		System.out.println("2 - Combattre une cr�ature");
		System.out.println("3 - Afficher votre score");
		System.out.println("4 - Quitter");
	}

}
