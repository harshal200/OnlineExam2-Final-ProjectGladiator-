package com.lti.onlineexam.core.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user_register")
@SequenceGenerator(name = "user_reg_seq", sequenceName = "USERREGISTER_SEQ", allocationSize = 1)
public class UserRegister {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_reg_seq")
	@Column(name="user_id")
	private int userId;
	
	@JsonIgnore
	@OneToMany(mappedBy = "userRegister",cascade = CascadeType.ALL)
	private List<ExamResult> examResult;

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
	
	
	
	public List<ExamResult> getExamResult() {
		return examResult;
	}

	public void setExamResult(List<ExamResult> examResult) {
		this.examResult = examResult;
	}

	public UserRegister() {
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
	
}
