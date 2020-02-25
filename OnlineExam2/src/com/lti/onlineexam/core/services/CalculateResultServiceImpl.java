package com.lti.onlineexam.core.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.onlineexam.core.daos.CalculateResultDao;
import com.lti.onlineexam.core.daos.QuestionDao;
import com.lti.onlineexam.core.entities.ExamResult;
import com.lti.onlineexam.core.entities.QIdAndAns;
import com.lti.onlineexam.core.entities.QueAndAns;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.entities.UserResponse;
import com.lti.onlineexam.core.exceptions.HrException;

@Service
public class CalculateResultServiceImpl implements CalculateResultService {

	@Autowired
	private QuestionDao resDao;

//	@Override
//	public List<UserResponse> calculateResult(List<QueAndAns> queAndAns) throws HrException {
//		List<Question> questios = resDao.fetchQuestions();
//		//System.out.println(response);
//		return  (List<UserResponse>) resDao;
//	}

	public int fetch(List<QueAndAns> queAndAns) throws HrException {
		try {
			int score= 0;
			List<QIdAndAns> q1=resDao.fetch(queAndAns);
			 for(QueAndAns q3:queAndAns) {
					for(QIdAndAns q5 : q1) {
						if(q3.getQuestionId()== q5.getQueId() && q3.getAnswer().equals(q5.getAns())) {
							score=score+1;
						}
					}
				}
				System.out.println(q1);
				return score;
		} catch (HrException e) {
			e.printStackTrace();
			throw e;
		}
	
	}
}
