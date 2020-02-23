package com.lti.onlineexam.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

@Repository
public class CalculateResultDaoImpl implements CalculateResultDao {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public int calculateResult(Question que) throws HrException {
		 
		
		 return 1;
		
		
	}

	
}
