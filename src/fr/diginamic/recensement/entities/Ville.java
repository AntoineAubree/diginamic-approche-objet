package fr.diginamic.recensement.entities;

public class Ville {

	private String codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private String codeCommune;
	private String nomCommune;
	private int popTotale;
	
	public Ville() {
	}

	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int popTotale) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popTotale = popTotale;
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopTotale() {
		return popTotale;
	}

	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ville [codeRegion=");
		builder.append(codeRegion);
		builder.append(", nomRegion=");
		builder.append(nomRegion);
		builder.append(", codeDepartement=");
		builder.append(codeDepartement);
		builder.append(", codeCommune=");
		builder.append(codeCommune);
		builder.append(", nomCommune=");
		builder.append(nomCommune);
		builder.append(", popTotale=");
		builder.append(popTotale);
		builder.append("]");
		return builder.toString();
	}

}
