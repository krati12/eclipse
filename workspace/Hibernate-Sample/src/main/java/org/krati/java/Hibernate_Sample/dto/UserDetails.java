package org.krati.java.Hibernate_Sample.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table (name="USER_DETAILS")
public class UserDetails {
	// before primary key of table
	@Id	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
//	@OneToMany(cascade = {CascadeType.ALL})
/*	@JoinTable(name="USER_VEHICLE", joinColumns=@JoinColumn(name="USER_ID"),
	inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))*/
//	@OneToMany(mappedBy="user")
	@ManyToMany
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}



}
