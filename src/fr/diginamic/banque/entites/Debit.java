package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, float montantOperation) {
		super(dateOperation, montantOperation);
	}

	@Override
	public String afficherType() {
		return "Débit";
	}

}
