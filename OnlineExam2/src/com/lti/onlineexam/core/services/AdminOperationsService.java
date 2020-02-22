package com.lti.onlineexam.core.services;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

public interface AdminOperationsService {

	public boolean insertQuestion(Question questions) throws HrException; 

}
