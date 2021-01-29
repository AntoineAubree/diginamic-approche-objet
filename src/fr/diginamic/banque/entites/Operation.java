package fr.diginamic.banque.entites;

public abstract class Operation {

	private String dateOperation;
	private float montantOperation;

	public Operation(String dateOperation, float montantOperation) {
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public float getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(float montantOperation) {
		this.montantOperation = montantOperation;
	}
	
	public abstract String afficherType();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operation [dateOperation=");
		builder.append(dateOperation);
		builder.append(", montantOperation=");
		builder.append(montantOperation);
		builder.append("]");
		return builder.toString();
	}

}
