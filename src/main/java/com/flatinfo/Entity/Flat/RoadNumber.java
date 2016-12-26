package com.flatinfo.Entity.Flat;

public enum RoadNumber {
	S ("Semel"),
	B ("BIS"),
	T ("TER"),
	Q ("Quarter");
	
	private final String roadNumber;

	private RoadNumber(String roadNumber) {
		this.roadNumber = roadNumber;
	}

	public String getRoadNumber() {
		return roadNumber;
	}
}
