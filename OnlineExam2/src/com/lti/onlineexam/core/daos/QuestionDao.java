package com.lti.onlineexam.core.daos;

import java.util.ArrayList;

import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.entities.Question;

public interface QuestionDao {
	

		public ArrayList<Question> fetchQuestions() throws HrException;
		//public Question fetchedQuestionWithId(int subjectId) throws HrException;	
		}

