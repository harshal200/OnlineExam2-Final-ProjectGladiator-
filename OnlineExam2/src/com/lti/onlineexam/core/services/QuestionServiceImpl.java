package com.lti.onlineexam.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.daos.QuestionDao;
import com.lti.onlineexam.core.entities.Question;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionDao dao;
	
	@Override
	public ArrayList<Question> fetchQuestions() throws HrException
	{
		return dao.fetchQuestions();
	}
}
