package com.lti.onlineexam.core.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.onlineexam.core.entities.ExamResult;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.entities.UserResponse;
import com.lti.onlineexam.core.exceptions.HrException;

@Repository
public class CalculateResultDaoImpl implements CalculateResultDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<UserResponse> calculateResult(List<UserResponse> response) throws HrException {
		System.out.println(response);
		return manager.merge(response);
		
	}
	
}

