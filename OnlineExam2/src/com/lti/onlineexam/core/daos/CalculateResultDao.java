package com.lti.onlineexam.core.daos;

import java.util.List;

import com.lti.onlineexam.core.entities.ExamResult;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.entities.UserResponse;
import com.lti.onlineexam.core.exceptions.HrException;

public interface CalculateResultDao {

	public List<UserResponse> calculateResult(List<UserResponse> response) throws HrException;
	//public ExamResult calculateResult(Question questions[]) throws HrException;

}
