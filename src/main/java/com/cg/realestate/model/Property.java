package com.cg.realestate.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

@Entity(name = "propert")
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int propertyId;
	@Column
	private Date date;
	@Column
	private String Url;
	@Column
	private String propertyType;
	@Column
	private String room;
	@Column 
	@NotNull
	private double budget;
	@Column
	private String popertyStatus; 
	@Column
	private String areaPerSq;
	@Column
	private int floorNo;
	@Column
	@NotNull
	private String location;
	@Column
	private String locality;
	@Column
	private String sellerName;
	@Column
	private String sellerEmailId;

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public Property( String url, String propertyType, String room, @NotNull double budget,
			String popertyStatus, String areaPerSq, int floorNo, @NotNull String location, String locality,
			String sellerName, String sellerEmailId) {
		super();
	
		Url = url;
		this.propertyType = propertyType;
		this.room = room;
		this.budget = budget;
		this.popertyStatus = popertyStatus;
		this.areaPerSq = areaPerSq;
		this.floorNo = floorNo;
		this.location = location;
		this.locality = locality;
		this.sellerName = sellerName;
		this.sellerEmailId = sellerEmailId;
	}




	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getPopertyStatus() {
		return popertyStatus;
	}

	public void setPopertyStatus(String popertyStatus) {
		this.popertyStatus = popertyStatus;
	}

	public String getAreaPerSq() {
		return areaPerSq;
	}

	public void setAreaPerSq(String areaPerSq) {
		this.areaPerSq = areaPerSq;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}




	public String getSellerName() {
		return sellerName;
	}




	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}




	public String getSellerEmailId() {
		return sellerEmailId;
	}




	public void setSellerEmailId(String sellerEmailId) {
		this.sellerEmailId = sellerEmailId;
	}
	

	// Constructor for Flat

}