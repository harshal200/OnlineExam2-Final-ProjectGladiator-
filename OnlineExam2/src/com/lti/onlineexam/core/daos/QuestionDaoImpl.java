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
public class QuestionDaoImpl implements QuestionDao {

	@PersistenceContext
	private EntityManager manager;

	// @Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<Question> fetchQuestions() throws HrException {
		String strQry = "select q from Question q";
		Query qry = manager.createQuery(strQry);
		List<Question> questionList = qry.getResultList();
		return questionList;
	}

	@Override
	public List<Question> fetchedQuestionWithId(int subjectId, int levels) throws HrException {
		String q = "select q from Question q join q.subject s where s.subjectId=:subjectId AND q.levels= :levels";
		Query q1 = manager.createQuery(q);
		q1.setParameter("subjectId", subjectId);
		q1.setParameter("levels", levels);
		return q1.getResultList();
	}

}
