package com.suffolk.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class ComputerOwner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="c_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name="sn")
	private Computer computer;

	public ComputerOwner() {
	}

	public ComputerOwner(User user, Computer computer) {
		this.user = user;
		this.computer = computer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ComputerOwner [id=" + id + ", user=" + user + ", computer=" + computer + "]";
	}
	
	
	
	

}
