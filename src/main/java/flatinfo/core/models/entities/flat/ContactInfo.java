package flatinfo.core.models.entities.flat;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ContactInfo {
	private FlatAddress address;
	private String city;
	private String country;
	
	public ContactInfo() {
		super();
	}
	public ContactInfo(FlatAddress address, String city, String country) {
		super();
		this.address = address;
		this.city = city;
		this.country = country;
	}
	public FlatAddress getAddress() {
		return address;
	}
	public void setAddress(FlatAddress address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
