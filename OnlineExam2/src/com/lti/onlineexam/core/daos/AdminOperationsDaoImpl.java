package com.lti.onlineexam.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.entities.Subject;
import com.lti.onlineexam.core.entities.UserRegister;
import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.entities.Subject;


@Repository
public class  AdminOperationsDaoImpl implements AdminOperationsDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<UserRegister> reportGeneration( String state, String city, int levels, int score) throws HrException {
			
			//u join u.examResult e where u.state=:state AND u.city=:city AND e.levels=:levels AND e.score=:score
	
		String q = "select u from UserRegister u join u.examResult e where u.state=:state AND u.city=:city AND e.levels=:levels AND e.score=:score";
		Query q1 = manager.createQuery(q);
		q1.setParameter("state", state);
		q1.setParameter("city", city);
		q1.setParameter("levels", levels);
		q1.setParameter("score", score);
		
		List<UserRegister> applicantList = q1.getResultList();
		return (ArrayList<UserRegister>) applicantList;
	
	
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean insertQuestion(Question questions) throws HrException {
		
	manager.merge(questions);
		
		return true;
	}
}
