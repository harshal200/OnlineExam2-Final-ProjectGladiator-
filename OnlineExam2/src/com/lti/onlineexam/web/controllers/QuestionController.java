package com.lti.onlineexam.web.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.entities.UserRegister;
import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.services.QuestionService;

@CrossOrigin
@RestController
public class QuestionController {
	//http://localhost:8181/OnlineExam2/queList
	@Autowired
	private QuestionService qService;
	
	@GetMapping(value = "/queList", produces = "application/json") 
	public @ResponseBody ArrayList<Question> getQuestionList() {
		ArrayList<Question> questionList = null;
		try {
			questionList = qService.fetchQuestions();
		} catch (HrException e) {
			
			e.printStackTrace();
		}

		return questionList;
	}
	
	/*
	 * @PutMapping(value="/getQuesById",consumes = "application/json",produces =
	 * "application/json") public @ResponseBody Question
	 * getQuestionById(@RequestBody Question subjectId) { int sId =
	 * subjectId.getSubjectId(); Question id1=null; try { id1 =
	 * qService.fetchedQuestionWithId(sId); } catch (HrException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } return id1; }
	 */
	
	
}
