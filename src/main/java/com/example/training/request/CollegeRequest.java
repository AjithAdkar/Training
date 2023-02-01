package com.example.training.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CollegeRequest {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotBlank(message = "name is mandatory")
	@Size(min = 2, max = 50, message = "entered name must be min 2 character")
	private String name;
	@NotBlank
	@Email
	private String emailid;
	private String address;
	private String street;
	private String state;
	private String district;
	@NotBlank
	@Pattern(regexp = "^$|[0-9]{10}", message = "phone number must be 10 digit")
	private String phonenumber;
	@NotNull
	@Pattern(regexp = "(^$|[0-9]{5,6})", message = "pincode should be 6 digit")
	private String pincode;
	private Long doornumber;
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Long getDoornumber() {
		return doornumber;
	}

	public void setDoornumber(Long doornumber) {
		this.doornumber = doornumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
