package flatinfo.core.models.enums;

public enum KitchenType {
	CS ("Cuisine séparée"),
	CA ("Cuisine américaine"),
	CC ("Coin cuisine"),
	CE ("Cuisine équipée");
	
	private String kitchen;

	private KitchenType(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getHeating() {
		return kitchen;
	}
}
