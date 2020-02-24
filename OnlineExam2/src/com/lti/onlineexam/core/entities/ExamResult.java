package com.lti.onlineexam.core.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EXAM_RESULT")
@SequenceGenerator(name = "examresult_seq", sequenceName = "EXAMRESULT_SEQ", allocationSize = 1)
public class ExamResult {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "examresult_seq")
	@Column(name="EXAMRESULT_ID")
	private int examResultId;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="SUBJECT_ID")
	private int subjectId;
	
	@Column(name="LEVELS")
	private int levels;
	
	@Column(name="SCORE")
	private int score;


	
	
	@ManyToOne()
	@JoinColumn(name="userId")
	private UserRegister userRegister;
	
	

	public UserRegister getUserRegister() {
		return userRegister;
	}

	public void setUserRegister(UserRegister userRegister) {
		this.userRegister = userRegister;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getLevels() {
		return levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "ExamResult [examResultId=" + examResultId + ", userId=" + userId + ", subjectId=" + subjectId
				+ ", levels=" + levels + ", score=" + score + ", userRegister=" + userRegister + "]";
	}

	

	
	
	
}
