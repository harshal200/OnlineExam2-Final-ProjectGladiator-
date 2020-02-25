package com.lti.onlineexam.core.entities;

public class QIdAndAns {

	private int queId;
	private String ans;
	public QIdAndAns() {
		super();
	}
	public QIdAndAns(int queId, String ans) {
		super();
		this.queId = queId;
		this.ans = ans;
	}
	public int getQueId() {
		return queId;
	}
	public void setQueId(int queId) {
		this.queId = queId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "QID_ANS [queId=" + queId + ", ans=" + ans + "]";
	}
	
}
