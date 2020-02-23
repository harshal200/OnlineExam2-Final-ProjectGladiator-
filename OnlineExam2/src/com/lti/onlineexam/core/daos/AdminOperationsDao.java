package com.lti.onlineexam.core.daos;

import java.util.List;

import com.lti.onlineexam.core.entities.UserRegister;
import com.lti.onlineexam.core.exceptions.HrException;

public interface AdminOperationsDao {

	//public boolean validateUser(String email,String password);
	//public boolean insertQuestion(Question questions) throws HrException;
	public List<UserRegister> reportGeneration(String state, String city, int levels, int score) throws HrException;
	

}
