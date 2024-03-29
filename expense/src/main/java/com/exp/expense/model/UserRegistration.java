package com.exp.expense.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="userregistration")
public class UserRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	//	public UserRegistration( String username, String password) {
//		super();
//		
//		this.username = username;
//		this.password = password;
//	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
