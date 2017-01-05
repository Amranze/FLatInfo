package flatinfo.core.models.enums;

public enum ContractType {
	LOC ("Location"),
	SLOC ("Sous Location"),
	COL ("Colocation"),
	ND ("Non Déclarer");
	
	private String contractType;

	private ContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getContractType() {
		return contractType;
	}
	
	
}
