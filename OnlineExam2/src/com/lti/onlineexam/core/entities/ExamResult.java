package com.lti.onlineexam.core.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EXAM_RESULT")
public class ExamResult {

	@Id
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
	
	@Column(name="EXAM_DATE")
	private LocalDate examDate;

	public int getExamResultId() {
		return examResultId;
	}

	public void setExamResultId(int examResultId) {
		this.examResultId = examResultId;
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

	public LocalDate getExamDate() {
		return examDate;
	}

	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}

	@Override
	public String toString() {
		return "ExamResult [examResultId=" + examResultId + ", userId=" + userId + ", subjectId=" + subjectId
				+ ", levels=" + levels + ", score=" + score + ", examDate=" + examDate + "]";
	}
	
	
}
