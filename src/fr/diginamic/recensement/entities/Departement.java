package fr.diginamic.recensement.entities;

public class Departement implements Comparable<Departement> {

	private String codeDepartement;
	private int populationTotale;

	public Departement(String codeDepartement, int populationTotale) {
		this.codeDepartement = codeDepartement;
		this.populationTotale = populationTotale;
	}

	@Override
	public int compareTo(Departement region) {
		if (this.populationTotale > region.populationTotale) {
			return -1;
		} else if (this.populationTotale < region.populationTotale) {
			return 1;
		} else {
			return 0;
		}
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
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
		builder.append("Departement [codeDepartement=");
		builder.append(codeDepartement);
		builder.append(", populationTotale=");
		builder.append(populationTotale);
		builder.append("]");
		return builder.toString();
	}

}
