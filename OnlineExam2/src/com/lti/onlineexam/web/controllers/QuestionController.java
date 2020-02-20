package com.lti.onlineexam.web.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.entities.UserRegister;
import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.services.QuestionService;

@RestController
public class QuestionController {
	//http://localhost:8181/OnlineExam2/queList
	@Autowired
	private QuestionService qservice;
	
	@GetMapping(value = "/queList", produces = "application/json") 
	public @ResponseBody ArrayList<Question> getQuestionList() {
		ArrayList<Question> questionList = null;
		try {
			questionList = qservice.fetchQuestions();
			//System.out.println(applicantList);
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return questionList;
	}
}
