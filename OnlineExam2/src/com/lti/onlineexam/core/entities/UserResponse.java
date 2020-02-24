package com.lti.onlineexam.core.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

public class UserResponse {

	private int userId;
	private int examId;
	private List<QueAndAns> qAndA;

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public List<QueAndAns> getqAndA() {
		return qAndA;
	}
	public void setqAndA(List<QueAndAns> qAndA) {
		this.qAndA = qAndA;
	}
	@Override
	public String toString() {
		return "UserResponse [userId=" + userId + ", examId=" + examId + ", qAndA=" + qAndA + "]";
	}
}
