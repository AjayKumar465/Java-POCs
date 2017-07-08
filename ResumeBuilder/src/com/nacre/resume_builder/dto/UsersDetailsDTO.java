package com.nacre.resume_builder.dto;

import java.io.Serializable;
import java.sql.Date;

public class UsersDetailsDTO implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	// details of user
	private String entryLevel;
	private Date date;
	private String strength;
	private String coutnry;
	private String address;
	private String city;
	private String state;
	private String habbits;
	private String photoPath;
    private String obj;
	private Integer userid;
	//setter and getter methods
	public String getEntryLevel() {
		return entryLevel;
	}

	public void setEntryLevel(String entryLevel) {
		this.entryLevel = entryLevel;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getCoutnry() {
		return coutnry;
	}

	public void setCoutnry(String coutnry) {
		this.coutnry = coutnry;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getHabbits() {
		return habbits;
	}

	public void setHabbits(String habbits) {
		this.habbits = habbits;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public String getObj() {
		return obj;
	}

	public void setObj(String obj) {
		this.obj = obj;
	}

}
