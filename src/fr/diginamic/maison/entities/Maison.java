package fr.diginamic.maison.entities;

public class Maison {

	private Piece[] tabPieces;

	public Maison() {
		this.tabPieces = new Piece[0];
	}

	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.getSuperficie() > 0) {
			Piece[] newTab = new Piece[tabPieces.length + 1];
			for (int i = 0; i < tabPieces.length; i++) {
				newTab[i] = tabPieces[i];
			}
			tabPieces = newTab;
			tabPieces[tabPieces.length - 1] = piece;
		}
	}

	public double getSuperficieTotale() {
		double superficie = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			superficie += tabPieces[i].getSuperficie();
		}
		return superficie;
	}

	public double getSuperficieParEtage(int etage) {
		double superficie = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getEtage() == etage) {
				superficie += tabPieces[i].getSuperficie();
			}
		}
		return superficie;
	}

	public double getSuperficieParTypePiece(int type) {
		double superficie = 0;
		String typePiece = verifierTypePiece(type);
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getClass().getSimpleName().equals(typePiece)) {
				superficie += tabPieces[i].getSuperficie();
			}
		}
		return superficie;
	}

	public int getNbPiecesParTypePiece(int type) {
		int nbPieces = 0;
		String typePiece = verifierTypePiece(type);
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getClass().getSimpleName().equals(typePiece)) {
				nbPieces ++;
			}
		}
		return nbPieces;
	}

	private String verifierTypePiece(int type) {
		String typePiece = "";
		if (type == 1) {
			typePiece = "Chambre";
		} else if (type == 2) {
			typePiece = "Cuisine";
		} else if (type == 3) {
			typePiece = "Salon";
		} else if (type == 4) {
			typePiece = "SalleDeBain";
		} else if (type == 5) {
			typePiece = "WC";
		}
		return typePiece;
	}
}
