package com.lti.onlineexam.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.lti.onlineexam.core.daos.AdminOperationsDao;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

@Service
public class AdminOperationsServiceImpl implements AdminOperationsService {

	@Autowired
	private AdminOperationsDao dao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public boolean insertQuestion(Question questions) throws HrException {
		
		return dao.insertQuestion(questions);
	}

}
