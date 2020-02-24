package com.lti.onlineexam.core.entities;

public class QueAndAns {
	private int questionId;
	private String answer;
	
	public QueAndAns() {
		super();
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QueAndAns [questionId=" + questionId + ", answer=" + answer + "]";
	}
}
