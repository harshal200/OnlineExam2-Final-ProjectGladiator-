package com.lti.onlineexam.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="QUESTION")
@Table(name="QUESTION")
public class Question {

	@Id
	@GeneratedValue
	@Column(name="QUESTION_ID")
	private int questionId;
	
	@Column(name="QUESTION")
	private String question;
	
	@Column(name="OPTION_1")
	private String option1;
	
	@Column(name="OPTION_2")
	private String option2;
	
	@Column(name="OPTION_3")
	private String option3;
	
	@Column(name="OPTION_4")
	private String option4;
	
	@Column(name="CORRECT_ANSWER")
	private String correctAnswer;
	
	@Column(name="SUBJECT_ID")
	private int subjectId;
	
	@Column(name="LEVELS")
	private int levels;

	public Question() {
		super();
	}

	public Question(int questionId, String question, String option1, String option2, String option3, String option4,
			String correctAnswer, int subjectId, int levels) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctAnswer = correctAnswer;
		this.subjectId = subjectId;
		this.levels = levels;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
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

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", option1=" + option1 + ", option2="
				+ option2 + ", option3=" + option3 + ", option4=" + option4 + ", correctAnswer=" + correctAnswer
				+ ", subjectId=" + subjectId + ", levels=" + levels + "]";
	}

	
}
