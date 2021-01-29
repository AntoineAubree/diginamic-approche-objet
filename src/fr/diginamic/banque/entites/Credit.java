package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOperation, float montantOperation) {
		super(dateOperation, montantOperation);
	}

	@Override
	public String afficherType() {
		return "Crédit";
	}

}
