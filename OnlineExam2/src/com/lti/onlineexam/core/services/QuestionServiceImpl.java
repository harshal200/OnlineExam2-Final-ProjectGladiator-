package com.lti.onlineexam.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.onlineexam.core.daos.QuestionDao;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionDao dao;
	
	//@Override
	//public List<Question> fetchQuestions() throws HrException
	//{
	//	return dao.fetchQuestions();
	//}


	  @Override 
	  public List<Question> fetchedQuestionWithId(int subjectId,int levels) throws HrException { 
		  return dao.fetchedQuestionWithId(subjectId, levels);
	  
	  }
	 
}
