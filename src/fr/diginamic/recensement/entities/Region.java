package fr.diginamic.recensement.entities;

public class Region implements Comparable<Region> {

	private String nomRegion;
	private int codeRedgion;
	private int populationTotale;

	public Region(String nomRegion, int codeRedgion, int populationTotale) {
		this.nomRegion = nomRegion;
		this.codeRedgion = codeRedgion;
		this.populationTotale = populationTotale;
	}

	@Override
	public int compareTo(Region region) {
		if (this.populationTotale > region.populationTotale) {
			return -1;
		} else if (this.populationTotale < region.populationTotale) {
			return 1;
		} else {
			return 0;
		}
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getCodeRedgion() {
		return codeRedgion;
	}

	public void setCodeRedgion(int codeRedgion) {
		this.codeRedgion = codeRedgion;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Region [nomRegion=");
		builder.append(nomRegion);
		builder.append(", codeRedgion=");
		builder.append(codeRedgion);
		builder.append(", populationTotale=");
		builder.append(populationTotale);
		builder.append("]");
		return builder.toString();
	}

}
