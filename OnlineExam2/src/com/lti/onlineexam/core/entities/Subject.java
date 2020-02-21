package com.lti.onlineexam.core.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="Subject")
public class Subject {

	@Id
	@Column(name="SUBJECT_ID")
	private int subjectId;
	
	@Column(name="SUBJECT_NAME")
	private String subjectName;
	
	
	
	  @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL) private
	  List<Question> question;

	  public List<Question> getQuestion() { 
		  return question; 
		  }
	 
	  public void setQuestion(List<Question> question) { 
		  this.question = question;
	  }
	 

	public Subject() {
		super();		
	}

	public Subject(int subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}
}
