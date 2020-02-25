package com.lti.onlineexam.core.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.onlineexam.core.daos.CalculateResultDao;
import com.lti.onlineexam.core.daos.QuestionDao;
import com.lti.onlineexam.core.entities.ExamResult;
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
			return resDao.fetch(queAndAns);
		} catch (HrException e) {
			e.printStackTrace();
			throw e;
		}
	
	}
}
