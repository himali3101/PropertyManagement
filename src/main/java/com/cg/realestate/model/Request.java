package com.cg.realestate.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.web.multipart.MultipartFile;


public class Request {
	
	private int propertyId;
	private Date date;
	
	private MultipartFile file;

	private String Url;
	private String propertyType;
	
	private String room;

	private double budget;
	
	private String popertyStatus;

	private String areaPerSq;
	
	private int floorNo;
	
	private String location;
	
	private String locality;

	private Seller seller;

	
	
	public Request() {
		super();
		// TODO Auto-generated constructor stub
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

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
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

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	
	

}
