package com.lti.onlineexam.core.daos;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.lti.onlineexam.core.entities.QIdAndAns;
import com.lti.onlineexam.core.entities.QueAndAns;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

@Repository
public class QuestionDaoImpl implements QuestionDao {

	@PersistenceContext
	private EntityManager manager;

	
//-----------------To Calculate Score-------------------//
	public List<QIdAndAns> fetch(List<QueAndAns> queAndAns) {
		String strQry = "select q from Question q";
		Query qry = manager.createQuery(strQry);
		List<Question> questionList = qry.getResultList();
		List<QIdAndAns> q1 = new ArrayList<QIdAndAns>();
		QIdAndAns ans = new QIdAndAns();
		//int score= 0;
		for(Question q : questionList) {
			ans.setQueId(q.getQuestionId());
			ans.setAns(q.getCorrectAnswer());
			q1.add(ans);
			ans = new QIdAndAns();	
		}
		return q1;
		
		
	}
	
	//----------To fetch questions with respective subject Id and levels----------//
	@Override
	public List<Question> fetchedQuestionWithId(int subjectId, int levels) throws HrException {
		String q = "select q from Question q join q.subject s where s.subjectId=:subjectId AND q.levels= :levels";
		Query q1 = manager.createQuery(q);
		q1.setParameter("subjectId", subjectId);
		q1.setParameter("levels", levels);
		return q1.getResultList();
	}

	//---------------To fetch Question---------------------
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<Question> fetchQuestions() throws HrException {
		String strQry = "select q from Question q";
		Query qry = manager.createQuery(strQry);
		List<Question> questionList = qry.getResultList();
		return questionList;
	}
}
