package flatinfo.core.models.entities.flat;

public class FlatAddress {
	private String flatNumber;
	private String buildingNumber;
	private String roadNumber;
	private String roadWay;
	private String roadName;
	//private int postalCode;
	
	public FlatAddress() {
		super();
	}

	public FlatAddress(String flatNumber, String buildingNumber, String roadNumber, String roadWay, String roadName) {
		super();
		this.flatNumber = flatNumber;
		this.buildingNumber = buildingNumber;
		this.roadNumber = roadNumber;
		this.roadWay = roadWay;
		this.roadName = roadName;
	}
	
	
	public FlatAddress(String roadNumber, String roadName) {
		super();
		this.roadNumber = roadNumber;
		this.roadName = roadName;
	}

	public FlatAddress(String roadName) {
		super();
		this.roadName = roadName;
	}

	public String getFlatNumber() {
		return flatNumber;
	}


	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
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


	/*public int getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}*/


	public String getRoadWay() {
		return roadWay;
	}


	public void setRoadWay(String roadWay) {
		this.roadWay = roadWay;
	}

	@Override
	public String toString() {
		return "FlatAddress [flatNumber=" + flatNumber + ", buildingNumber=" + buildingNumber + ", roadNumber="
				+ roadNumber + ", roadWay=" + roadWay + ", roadName=" + roadName + "]";
	}
	
}
