package fr.diginamic.operations;

public class CalculMoyenne {

	private double[] tabDoubles;
	
	public CalculMoyenne() {
		this.tabDoubles = new double[0];
	}
	
	public void ajout (double d) {
		double[] newTab = new double[tabDoubles.length + 1];
		for (int i = 0; i < tabDoubles.length; i++) {
			newTab[i] = tabDoubles[i];
		}
		tabDoubles = newTab;
		tabDoubles[tabDoubles.length - 1] = d;
	}

	public double calcul() {
		double moyenne = 0;
		double somme = 0;
		for (int i = 0; i < tabDoubles.length; i++) {
			somme += tabDoubles[i];
		}
		moyenne = somme / tabDoubles.length;
		return moyenne;
	}
	
	
	
}
