package com.flatinfo.Entity.User;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.flatinfo.Entity.Flat.FlatEntity;

@Document(collection="userCollection")
public class UserEntity {
	//TODO will I need the id
	private long id;
	private String firstName;
	private String lastName;
	private String mail;
	private String username;
	private String password;
	private Date birthdate;
	private int age;
	private String gender;
	private String phone;
	private String adresse;
	private int postalCode;
	private String city;
	private String country;
	private long lastConnection;
	private boolean Active;
	private List<String> pictures;
	private List<FlatEntity> flats;
	private String stayingTime;
	//What need to be showen
	private ShowInfo infoToShow;
	//Social Network
	private SocialNetwork socialNetwork;
	/*private String fbUrl;
	private String linkedinUrl;
	private String TwitterUrl;*/
	
	//TODO add a variable for rating the user or complaints on the user if he is really trustfull and add something for verifing identity
	//card beside fb and linkedIn and his phone
	
	public UserEntity() {
		super();
	}
	
	public UserEntity(long id, String firstName, String lastName, String mail, String username, String password,
			Date birthdate, int age, String gender, String phone, String adresse, int postalCode, String city,
			String country, long lastConnection, boolean active, List<String> pictures, List<FlatEntity> flats,
			String stayingTime, ShowInfo infoToShow, SocialNetwork socialNetwork) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.username = username;
		this.password = password;
		this.birthdate = birthdate;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.adresse = adresse;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
		this.lastConnection = lastConnection;
		Active = active;
		this.pictures = pictures;
		this.flats = flats;
		this.stayingTime = stayingTime;
		this.infoToShow = infoToShow;
		this.socialNetwork = socialNetwork;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
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
	public long getLastConnection() {
		return lastConnection;
	}
	public void setLastConnection(long lastConnection) {
		this.lastConnection = lastConnection;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}
	public List<String> getPictures() {
		return pictures;
	}
	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}
	public List<FlatEntity> getFlats() {
		return flats;
	}
	public void setFlats(List<FlatEntity> flats) {
		this.flats = flats;
	}
	public String getStayingTime() {
		return stayingTime;
	}
	public void setStayingTime(String stayingTime) {
		this.stayingTime = stayingTime;
	}
	public ShowInfo getInfoToShow() {
		return infoToShow;
	}
	public void setInfoToShow(ShowInfo infoToShow) {
		this.infoToShow = infoToShow;
	}
	public SocialNetwork getSocialNetwork() {
		return socialNetwork;
	}
	public void setSocialNetwork(SocialNetwork socialNetwork) {
		this.socialNetwork = socialNetwork;
	}
	
	
}
