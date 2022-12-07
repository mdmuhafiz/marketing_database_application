package com.marketingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leads")
public class Lead {
	@Id
	private long id;
	@Column(name = "first_name",length = 45,nullable = false)
	private String firstName;
	@Column(name = "last_name",length = 45,nullable = false)
	private String lastName;
	@Column(name = "email",length = 128,nullable = false)
	private String email;
	@Column(name = "city",length = 45,nullable = false)
	private String city;
	@Column(name = "mobile",length = 10,nullable = false)
	private String mobile;
	public Lead() {
		
	}
	
	public Lead(long id, String firstName, String lastName, String email, String city, String mobile) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.city = city;
		this.mobile = mobile;
	}

	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getCity() {
		return city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
