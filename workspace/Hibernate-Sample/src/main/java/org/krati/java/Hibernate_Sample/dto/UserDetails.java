package org.krati.java.Hibernate_Sample.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
/*treat this class as entity
 * 
 */
public class UserDetails {
	/*
	 * before primary key of table
	 */
	@Id	
	private int userId;
	private String userName;
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
	

}
