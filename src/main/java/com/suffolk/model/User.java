package com.suffolk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {

	@Id
	private Long cId;
	private String first_name;
	private String last_name;
	private String prefer_name;
	@OneToOne
	private Location location;
	
	
	public User() {
		super();
	}


	public User(Long cId, String first_name, String last_name, String prefer_name, Location location) {
		this.cId = cId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.prefer_name = prefer_name;
		this.location = location;
	}


	public Long getCId() {
		return cId;
	}


	public void setCId(Long cId) {
		this.cId = cId;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getPrefer_name() {
		return prefer_name;
	}


	public void setPrefer_name(String prefer_name) {
		this.prefer_name = prefer_name;
	}
	
	
	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "User [cId=" + cId + ", first_name=" + first_name + ", last_name=" + last_name + ", prefer_name="
				+ prefer_name + ", location=" + location + "]";
	}



	
	
	
	
}
