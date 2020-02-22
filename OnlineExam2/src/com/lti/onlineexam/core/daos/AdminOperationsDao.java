package com.lti.onlineexam.core.daos;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

public interface AdminOperationsDao {

	//public boolean validateUser(String email,String password);
	public boolean insertQuestion(Question questions) throws HrException; 

}
