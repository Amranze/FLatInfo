package flatinfo.core.models.entities.user;

public class Friends {

	private String firstName;
	private String lastName;
	private String profilePicture;
	private String age;
	private String address;
	
	public Friends(String firstName, String lastName, String profilePicture, String age, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilePicture = profilePicture;
		this.age = age;
		this.address = address;
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

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Friends [firstName=" + firstName + ", lastName=" + lastName + ", profilePicture=" + profilePicture
				+ ", age=" + age + ", address=" + address + "]";
	}
	
}
