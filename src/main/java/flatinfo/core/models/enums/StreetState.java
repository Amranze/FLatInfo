package flatinfo.core.models.enums;

public enum StreetState {
	BD ("Mauvais"),
	GD ("Bien"),
	CM ("Calme"),
	NS ("Bruyant"),
	EN ("Énergétique"),
	PF ("Parfait"),
	MG ("Magnifique");
	
	private String streetState;

	private StreetState(String streetState) {
		this.streetState = streetState;
	}

	public String getStreetState() {
		return streetState;
	}
	
	

}
