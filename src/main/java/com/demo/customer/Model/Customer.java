package com.demo.customer.Model;
// table as a Java object
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="Customers")
public class 	Customer {
	
	@Id
	@GeneratedValue
	@Column(name="Customer_Id")
	private Long id;

	@Column(name="First_Name")
	private String firstName;

	@Column(name="Last_Name")
	private String lastName;

	@Column(name="Address_Line_1")
	private String addressLine1;

	@Column(name="Address_Line_2")
	private String addressLine2;

	@Column(name="City")
	private String city;

	@Column(name="ZIP_Code")
	private String zipCode;

	@Column(name="State")
	private String state;

	@Column(name="Country")
	private String country;

	@Column(name="Mobile_No")
	private String mobileNo;

	@Column(name="Email")
	private String email;

	@Column(name="DOB")
	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="Aadhaar_No")
	private String aadharNo;

	@Column(name="PAN_No")
	private String panNo;

	@Column(name="SSN")
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
