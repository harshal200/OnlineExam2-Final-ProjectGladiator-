package com.lti.onlineexam.core.daos;

import java.util.List;

import com.lti.onlineexam.core.entities.QueAndAns;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

public interface QuestionDao {
	
		public int fetch(List<QueAndAns> que) throws HrException;
		public List<Question> fetchQuestions() throws HrException;
		public List<Question> fetchedQuestionWithId(int subjectId, int levels) throws HrException;	
}

