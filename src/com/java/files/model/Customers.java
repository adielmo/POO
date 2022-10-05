package com.java.files.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Customers {
	
	private UUID uuid;
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String contactNo;
	private String country;
	private String dob;
	private BigDecimal amount;
	
	public Customers() {
		// TODO Auto-generated constructor stub
	}


	public Customers(UUID uuid, Long id, String firstName, String lastName, String email, String gender, String contactNo,
			String country, String dob) {
		this.uuid =uuid;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.contactNo = contactNo;
		this.country = country;
		this.dob = dob;
		
	}
	
	public Customers(UUID uuid, Long id, String firstName, String lastName, String email, String gender,
			String contactNo, String country, String dob, BigDecimal amount) {
		this.uuid = uuid;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.contactNo = contactNo;
		this.country = country;
		this.dob = dob;
		this.amount = amount;
	}
	 
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "" + this.uuid + ", " + this.id + ", " + this.firstName + ", " + this.lastName
				+ ", " + this.email + ", " + this.gender + ", " + this.contactNo + ", " + 
				this.country + ", " + this.dob+", "+ this.amount ;
	}

	/*
	 * @Override public String toString() { return "Customers [uuid=" + uuid +
	 * ", id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +
	 * ", email=" + email + ", gender=" + gender + ", contactNo=" + contactNo +
	 * ", country=" + country + ", dob=" + dob + "]"; }
	 */
	
	
	
	
	
}
