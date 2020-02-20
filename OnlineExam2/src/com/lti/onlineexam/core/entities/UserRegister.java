package com.lti.onlineexam.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="ureg")
@Table(name = "user_register")

public class UserRegister {

	//@GeneratedValue
	
	@Id
	@SequenceGenerator(name = "SequenceIdGenerator", sequenceName = "HIBERNATE_SEQUENCE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceIdGenerator")
	@Column(name = "user_id")
	private int userId;

	@Column(name = "full_name")
	private String firstName;

	@Column(name = "email_id")
	private String email;
	
	@Column(name = "password")
	private String password;

	@Column(name = "mobile_number")
	private long mobileNumber;
	
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	
	@Column(name = "qualification")
	private String qualification;
	
	@Column(name = "year_of_completion")
	private int yearOfCompletion;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;
	
	public UserRegister() {
	
	}

	public UserRegister(int userId, String firstName, String email, String password, long mobileNumber,
			String dateOfBirth, String qualification, int yearOfCompletion, String city, String state) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.qualification = qualification;
		this.yearOfCompletion = yearOfCompletion;
		this.city = city;
		this.state = state;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYearOfCompletion() {
		return yearOfCompletion;
	}

	public void setYearOfCompletion(int yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "UserRegister [userId=" + userId + ", firstName=" + firstName + ", email=" + email + ", password="
				+ password + ", mobileNumber=" + mobileNumber + ", dateOfBirth=" + dateOfBirth + ", qualification="
				+ qualification + ", yearOfCompletion=" + yearOfCompletion + ", city=" + city + ", state=" + state
				+ "]";
	}

	
}
