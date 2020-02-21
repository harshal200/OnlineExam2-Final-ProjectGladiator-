package com.lti.onlineexam.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.services.QuestionService;

@CrossOrigin
@RestController
public class QuestionController {
	// http://localhost:8181/OnlineExam2/queList
	@Autowired
	private QuestionService qService;

	/*@GetMapping(value = "/queList", produces = "application/json")
	public @ResponseBody ArrayList<Question> getQuestionList() {
		ArrayList<Question> questionList = null;
		try {
			questionList = qService.fetchQuestions();
		} catch (HrException e) {

			e.printStackTrace();
		}

		return questionList;
	}*/

	@GetMapping(value="/getQuesById/{subjectId}", produces="application/json") 
	  public @ResponseBody List<Question> getQuestionById(@PathVariable("subjectId") int subjectId) { 
	  try {
		  List<Question> listOfQuestions = qService.fetchedQuestionWithId(subjectId);
		  return listOfQuestions;
	  } 
	  	catch (HrException e) {
	  		e.printStackTrace(); 
	  		return null; //instead check how to: exception handling in spring rest/mvc
	  } 
	}
}
