package com.demo.customer.Model;
// table as a Java object
import java.util.Date;

import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;

@Entity
@Table(name="Customers")
public class 	Customer {
	
	@Id
	@GeneratedValue
	@Column(name="Customer_Id")
	private Long id;
	
	////@NotNull(message="First_Name must not be empty")
	@Column(name="First_Name")
	//@Pattern(regexp="^[A-Za-z]+",message="Please enter First Name in correct format.")
	private String firstName;
	
	//@NotNull(message="Last_Name must not be empty")
	@Column(name="Last_Name")
	//@Pattern(regexp="^[A-Za-z]+",message="Please enter Last Name in correct format.")
	private String lastName;

	//@NotNull(message="Address Line-1 can not be empty.")
	@Column(name="Address_Line_1")
	//@Pattern(regexp="^[A-Za-z]+",message="Please enter Address Line-1 in correct format.")
	private String addressLine1;

	//@NotNull(message="Address Line-1 can not be empty.")
	@Column(name="Address_Line_2")
	//@Pattern(regexp="^[A-Za-z]+",message="Please enter Address Line-1 in correct format.")
	private String addressLine2;

	//@NotNull(message="City cannot be null.")
	@Column(name="City")
	//@Pattern(regexp="^[A-Za-z]+",message="Please enter city in correct format.")
	private String city;

	//@NotNull(message="ZIP Code can not be empty.")
	@Column(name="ZIP_Code")
	//@Pattern(regexp="^[0-9]{6}",message="Please enter 6-Digit ZIP Code.")
	private String zipCode;

	//@NotNull(message="State can not be empty.")
	@Column(name="State")
	//@Pattern(regexp="^[A-Za-z]+",message="Please enter State in correct format.")
	private String state;

	//@NotNull(message="Country can not be empty.")
	@Column(name="Country")
	//@Pattern(regexp="^[A-Za-z]+",message="Please enter Country in correct format.")
	private String country;

	//@NotNull(message="Mobile_No must not be null")
	@Column(name="Mobile_No")
	//@Pattern(regexp="^[0-9]{10}",message="Please enter 10-Digit Mobile No.")
	private String mobileNo;

	//@NotNull(message="Email should not be missing")
	@Column(name="Email")
	private String email;

	//@NotNull(message="Date should not be null.")
	@Column(name="DOB")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	//@NotNull(message="Aadhaar Number must not be empty")
	@Column(name="Aadhaar_No")
	//@Pattern(regexp="^[0-9]{12}",message="Please enter Aadhaar Number in correct format.")
	private String aadharNo;
	
	//@NotNull(message="PAN Number must not be empty")
	@Column(name="PAN_No")
	//@Pattern(regexp="^[A-Za-z0-9]{10}",message="Please enter PAN Number in correct format.")
	private String panNo;

	//@NotNull(message="SSN")
	@Column(name="SSN")
	//@Pattern(regexp = "^[A-Za-z0-9]{10}", message="Please enter the correct format.")
	private String ssn;
   
	public Customer() {
		
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	@Override
//	public String toString() {
//		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
//				+ "]";
//	}
//
		
}
