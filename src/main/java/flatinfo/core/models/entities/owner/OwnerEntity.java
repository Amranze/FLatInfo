package flatinfo.core.models.entities.owner;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import flatinfo.core.models.entities.flat.FlatEntity;

@Document
public class OwnerEntity {
	private long id;
	private String firstName;
	private String lastName;
	private String mail;
	private String phone;
	private List<String> view;
	private List<FlatEntity> flats;
	private boolean positiveView;
	//Rating is a String to show if the owner is a helpful person or not or he is quite or some fraud  
	private int rating;
	
	public OwnerEntity() {
		super();
	}

	public OwnerEntity(long id, String firstName, String lastName, String mail, String phone, List<String> view,
			List<FlatEntity> flats, boolean positiveView, int rating) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.phone = phone;
		this.view = view;
		this.flats = flats;
		this.positiveView = positiveView;
		this.rating = rating;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<String> getView() {
		return view;
	}

	public void setView(List<String> view) {
		this.view = view;
	}

	public List<FlatEntity> getFlats() {
		return flats;
	}

	public void setFlats(List<FlatEntity> flats) {
		this.flats = flats;
	}

	public boolean isPositiveView() {
		return positiveView;
	}

	public void setPositiveView(boolean positiveView) {
		this.positiveView = positiveView;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
