package com.lti.onlineexam.core.services;

import java.util.ArrayList;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

public interface QuestionService {
	public ArrayList<Question> fetchQuestions() throws HrException;
}
