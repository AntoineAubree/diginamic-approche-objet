package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {

		Credit credit01 = new Credit("2020/12/12", 15);
		Credit credit02 = new Credit("2020/12/15", 15.3F);
		Credit credit03 = new Credit("2020/12/18", 2.6F);
		Credit credit04 = new Credit("2020/12/19", 145);

		Debit debit01 = new Debit("2020/12/10", 5);
		Debit debit02 = new Debit("2020/12/15", 50.2F);
		Debit debit03 = new Debit("2020/12/25", 53);
		Debit debit04 = new Debit("2020/12/25", 5.36F);

		Operation[] tabOperations = { credit01, credit02, credit03, credit04, debit01, debit02, debit03, debit04 };

		float somme = 0;

		for (Operation operation : tabOperations) {
			if (operation.getClass().getSimpleName().equals("Credit")) {
				somme += operation.getMontantOperation();
			} else if (operation.getClass().getSimpleName().equals("Debit")) {
				somme -= operation.getMontantOperation();
			}
			System.out.println(operation.getClass().getSimpleName() + " : " + operation.getDateOperation() + " : "
					+ operation.getMontantOperation());
		}
		System.out.println("Somme = " + somme);

		somme = 0;

		for (Operation operation : tabOperations) {
			if (operation.afficherType().equals("Crédit")) {
				somme += operation.getMontantOperation();
			} else if (operation.afficherType().equals("Débit")) {
				somme -= operation.getMontantOperation();
			}
			System.out.println(operation.afficherType() + " : " + operation.getDateOperation() + " : "
					+ operation.getMontantOperation());
		}
		System.out.println("Somme = " + somme);

	}

}
