package com.lti.onlineexam.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;


@Repository
public class  AdminOperationsDaoImpl implements AdminOperationsDao {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public boolean insertQuestion(Question questions) throws HrException {
		manager.merge(questions);
		return true;
	}


	

}
