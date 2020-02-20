package com.lti.onlineexam.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="EXAMRESULT")
@Table(name="Exam_Result")
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

	public ExamResult() {
		super();
	}

	public ExamResult(int examResultId, int userId, int subjectId, int levels, int score) {
		super();
		this.examResultId = examResultId;
		this.userId = userId;
		this.subjectId = subjectId;
		this.levels = levels;
		this.score = score;
	}

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

	@Override
	public String toString() {
		return "ExamResult [examResultId=" + examResultId + ", userId=" + userId + ", subjectId=" + subjectId
				+ ", levels=" + levels + ", score=" + score + "]";
	}
}
