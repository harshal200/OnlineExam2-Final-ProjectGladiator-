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
	
		String strQry = "select question,option1,option2,option3,option4 from QUESTION";
		Query qry = manager.createQuery(strQry);
		List<Question> questionList = qry.getResultList();
		return (ArrayList<Question>) questionList;
	}

	/*
	 * @Override public Question fetchedQuestionWithId(int subjectId) throws
	 * HrException {
	 * 
	 * String q="select e from Question e join e.subject s where s.subjectId=:m";
	 * Query q1=manager.createQuery(q); q1.setParameter("m", subjectId); Question
	 * questionList = manager.find(Question.class,subjectId ); return questionList;
	 * //manager.find(entityClass, primaryKey) }
	 */

}
