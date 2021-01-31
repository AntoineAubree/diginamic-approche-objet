package fr.diginamic.maison.entities;

public class TestMaison {

	public static void main(String[] args) {
		Maison maMaison = new Maison();
		maMaison.ajouterPiece(new Cuisine(32.5, 0));
		maMaison.ajouterPiece(new Salon(50.4, 0));
		maMaison.ajouterPiece(new Chambre(26, 1));
		System.out.println("La superficie totale de la maison est : " + maMaison.getSuperficieTotale());
		System.out.println("La superficie du rdc de la maison est : " + maMaison.getSuperficieParEtage(0));
		System.out.println("La superficie du 1er étage de la maison est : " + maMaison.getSuperficieParEtage(1));
		System.out.println("----------------------------------------------------------");
		maMaison.ajouterPiece(new Chambre(24, 1));
		maMaison.ajouterPiece(new Chambre(34, 2));
		System.out.println("La superficie totale de la maison est : " + maMaison.getSuperficieTotale());
		System.out.println("La superficie du rdc de la maison est : " + maMaison.getSuperficieParEtage(0));
		System.out.println("La superficie du 1er étage de la maison est : " + maMaison.getSuperficieParEtage(1));
		System.out.println("----------------------------------------------------------");
		maMaison.ajouterPiece(null);
		System.out.println("La superficie totale de la maison est : " + maMaison.getSuperficieTotale());
		System.out.println("La superficie du rdc de la maison est : " + maMaison.getSuperficieParEtage(0));
		System.out.println("La superficie du 1er étage de la maison est : " + maMaison.getSuperficieParEtage(1));
		System.out.println("----------------------------------------------------------");
		maMaison.ajouterPiece(new Chambre(-24, 1));
		System.out.println("La superficie totale de la maison est : " + maMaison.getSuperficieTotale()); 
		System.out.println("La superficie du rdc de la maison est : " + maMaison.getSuperficieParEtage(0));
		System.out.println("La superficie du 1er étage de la maison est : " + maMaison.getSuperficieParEtage(1));
		System.out.println("----------------------------------------------------------");
		System.out.println("La superficie totale des chambres est : " + maMaison.getSuperficieParTypePiece(1)); 
		System.out.println("Le nombre de chambres est : " + maMaison.getNbPiecesParTypePiece(1)); 

	}

}
