package com.lti.onlineexam.core.services;

import java.util.List;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

public interface QuestionService {
	//public List<Question> fetchQuestions() throws HrException;
	public List<Question> fetchedQuestionWithId(int subjectId, int levels) throws HrException;
}
