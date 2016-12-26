package com.flatinfo.Entity.Flat;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.flatinfo.Entity.Owner.OwnerEntity;
import com.flatinfo.Entity.User.UserEntity;


@Document
public class FlatEntity {
	private long id;
	//TODO delete id because in Mongodb you have _id that stores timestamp
	private FlatType type;
	private ContactInfo flatInfo;
	private boolean furnished;
	private String area;
	private double price;
	private double priceOfLoad;
	private String advantages;
	private String problems;
	private String rating;
	private List<String> pictures;
	private List<UserEntity> users;
	private OwnerEntity owner;
	private Convenience conveniences;
	//private List<SchoolType> schools;
	//private List<TransportType> transports;
	//TODO Need to think about something to add like is it closer to Public transports
	public FlatEntity() {
		super();
	}
	public FlatEntity(long id, FlatType type, ContactInfo flatInfo, boolean furnished, String area, double price,
			double priceOfLoad, String advantages, String problems, String rating, List<String> pictures,
			List<UserEntity> users, OwnerEntity owner, Convenience conveniences) {
		super();
		this.id = id;
		this.type = type;
		this.flatInfo = flatInfo;
		this.furnished = furnished;
		this.area = area;
		this.price = price;
		this.priceOfLoad = priceOfLoad;
		this.advantages = advantages;
		this.problems = problems;
		this.rating = rating;
		this.pictures = pictures;
		this.users = users;
		this.owner = owner;
		this.conveniences = conveniences;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public FlatType getType() {
		return type;
	}
	public void setType(FlatType type) {
		this.type = type;
	}
	public ContactInfo getFlatInfo() {
		return flatInfo;
	}
	public void setFlatInfo(ContactInfo flatInfo) {
		this.flatInfo = flatInfo;
	}
	public boolean isFurnished() {
		return furnished;
	}
	public void setFurnished(boolean furnished) {
		this.furnished = furnished;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPriceOfLoad() {
		return priceOfLoad;
	}
	public void setPriceOfLoad(double priceOfLoad) {
		this.priceOfLoad = priceOfLoad;
	}
	public String getAdvantages() {
		return advantages;
	}
	public void setAdvantages(String advantages) {
		this.advantages = advantages;
	}
	public String getProblems() {
		return problems;
	}
	public void setProblems(String problems) {
		this.problems = problems;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public List<String> getPictures() {
		return pictures;
	}
	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}
	public List<UserEntity> getUsers() {
		return users;
	}
	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}
	public OwnerEntity getOwner() {
		return owner;
	}
	public void setOwner(OwnerEntity owner) {
		this.owner = owner;
	}
	public Convenience getConveniences() {
		return conveniences;
	}
	public void setConveniences(Convenience conveniences) {
		this.conveniences = conveniences;
	}
	
	
	
}
