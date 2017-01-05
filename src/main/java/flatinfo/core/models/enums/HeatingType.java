package flatinfo.core.models.enums;

public enum HeatingType {
	INDIV("Individuel"),
	CENT ("Central"),
	ELECT ("Électrique"),
	GAS ("Gaz"),
	FUEL ("Fuel"),
	RADI("Radiateur"),
	GRD ("Sol");
	
	private String heating;

	private HeatingType(String heating) {
		this.heating = heating;
	}

	public String getHeating() {
		return heating;
	}
	
}
