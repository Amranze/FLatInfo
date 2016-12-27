package com.flatinfo.Entity.Flat;

public class FlatAddress {
	private String roadNumber;
	private String roadWay;
	private String roadName;
	private int postalCode;	
	
	public FlatAddress(String roadNumber, String roadWay, String roadName, int postalCode) {
		super();
		this.roadNumber = roadNumber;
		this.roadWay = roadWay;
		this.roadName = roadName;
		this.postalCode = postalCode;
	}


	public FlatAddress() {
		super();
	}


	public String getRoadNumber() {
		return roadNumber;
	}


	public void setRoadNumber(String roadNumber) {
		this.roadNumber = roadNumber;
	}


	public String getRoadName() {
		return roadName;
	}


	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}


	public int getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}


	public String getRoadWay() {
		return roadWay;
	}


	public void setRoadWay(String roadWay) {
		this.roadWay = roadWay;
	}

}
