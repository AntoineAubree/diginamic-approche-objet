package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Été", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int numero;

	private Saison(String libelle, int numero) {
		this.libelle = libelle;
		this.numero = numero;
	}
	
	public static Saison getInstance(String libelle) throws BadLibelleException {
		for (Saison saison : Saison.values()) {
			if (saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}
		throw new BadLibelleException("Ce libellé n'existe pas");
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
