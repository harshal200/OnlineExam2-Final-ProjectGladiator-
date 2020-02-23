package com.lti.onlineexam.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.onlineexam.core.daos.CalculateResultDao;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

@Service
public class CalculateResultServiceImpl implements CalculateResultService {

	@Autowired
	private CalculateResultDao resDao;
	
	@Transactional
	@Override
	public int calculateResult(Question que) throws HrException {
		 
		int score=0;
		int qId = que.getQuestionId();
		String selectedAns = que.getCorrectAnswer();
		
		Question question = new Question();
		int qIdInTable = question.getQuestionId();
		String correctAnsInTable = question.getCorrectAnswer();
		
		if((qId==qIdInTable) && (selectedAns.equals(correctAnsInTable))){
			score++;
			
		}
		return score;
		
		
	}

	

}
