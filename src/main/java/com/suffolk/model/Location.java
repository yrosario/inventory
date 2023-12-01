package com.suffolk.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Location implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name="building_id")
	private Building building;
	
	@Id
	@ManyToOne
	@JoinColumn(name="floor_number")
	private Floor floor;

	public Location() {
	}

	public Location(Building building, Floor floor) {
		this.building = building;
		this.floor = floor;
	}


	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "FloorToBuilding [building=" + building + ", floor=" + floor + "]";
	}
	
	
	
	
	
	
}
