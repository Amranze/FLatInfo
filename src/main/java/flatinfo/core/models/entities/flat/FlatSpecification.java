package flatinfo.core.models.entities.flat;

import java.util.List;

import flatinfo.core.models.enums.StreetState;



public class FlatSpecification {
	//if the neighbours are noisy
	private boolean noisyFlat;
	//The state of the street
	private StreetState streetState;
	//if there is some gyms, pubs, supermarkets
	private List<String> gyms;
	private List<String> pubs;
	private List<String> supermarkets;
	
	public FlatSpecification() {
		super();
	}

	public FlatSpecification(boolean noisyFlat, StreetState streetState, List<String> gyms, List<String> pubs,
			List<String> supermarkets) {
		super();
		this.noisyFlat = noisyFlat;
		this.streetState = streetState;
		this.gyms = gyms;
		this.pubs = pubs;
		this.supermarkets = supermarkets;
	}

	public boolean isNoisyFlat() {
		return noisyFlat;
	}

	public void setNoisyFlat(boolean noisyFlat) {
		this.noisyFlat = noisyFlat;
	}

	public StreetState getStreetState() {
		return streetState;
	}

	public void setStreetState(StreetState streetState) {
		this.streetState = streetState;
	}

	public List<String> getGyms() {
		return gyms;
	}

	public void setGyms(List<String> gyms) {
		this.gyms = gyms;
	}

	public List<String> getPubs() {
		return pubs;
	}

	public void setPubs(List<String> pubs) {
		this.pubs = pubs;
	}

	public List<String> getSupermarkets() {
		return supermarkets;
	}

	public void setSupermarkets(List<String> supermarkets) {
		this.supermarkets = supermarkets;
	}
}
