package com.lti.onlineexam.core.daos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

@Repository
public class QuestionDaoImpl implements QuestionDao{

	@PersistenceContext
	private EntityManager manager;
	
	//@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public ArrayList<Question> fetchQuestions() throws HrException {
	
		String strQry = "select levels from QUESTION";
		Query qry = manager.createQuery(strQry);
		List<Question> questionList = qry.getResultList();
		return (ArrayList<Question>) questionList;
	}

}
