package com.flatinfo.Entity.Flat;

public enum FlatType {
	S ("Studio"),
	F1 ("Appartement F1"),
	F2 ("Appartement F2"),
	F3 ("Appartement F3"),
	CH ("Château"),
	LF ("Loft"),
	HP ("Hôtel Particulier");
	
	private final String type;
	
	private FlatType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
}
