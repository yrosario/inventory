package com.suffolk.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Floor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long floorNumber;

	public Floor() {
	}

	public Floor(Long floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Long getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(Long floorNumber) {
		this.floorNumber = floorNumber;
	}

	@Override
	public String toString() {
		return "Floor [floorNumber=" + floorNumber + "]";
	}
	
	
	
}
