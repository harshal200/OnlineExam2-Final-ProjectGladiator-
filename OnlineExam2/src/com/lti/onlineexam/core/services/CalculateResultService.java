package com.lti.onlineexam.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.onlineexam.core.entities.ExamResult;
import com.lti.onlineexam.core.entities.QueAndAns;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.entities.UserResponse;
import com.lti.onlineexam.core.exceptions.HrException;

public interface CalculateResultService {

	
	public List<UserResponse> calculateResult(List<QueAndAns> queAndAns) throws HrException;
	public int fetch(List<QueAndAns> queAndAns) throws HrException;
}
