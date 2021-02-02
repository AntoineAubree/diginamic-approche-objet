package fr.diginamic.interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {

		ObjetGeometrique[] tabObjet = new ObjetGeometrique[2];

		tabObjet[0] = new Cercle(25);
		tabObjet[1] = new Rectangle(5, 6);
		
		for (ObjetGeometrique objetGeometrique : tabObjet) {
			System.out.println("Forme : " + objetGeometrique.getClass().getSimpleName());
			System.out.println("Périmètre : " + objetGeometrique.perimetre());
			System.out.println("Surface : " + objetGeometrique.surface());
			System.out.println("-------------------------------");
		}

	}

}
