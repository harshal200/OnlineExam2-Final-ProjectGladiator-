package com.lti.onlineexam.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.entities.UserRegister;
import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.services.AdminOperationsService;


@CrossOrigin
@RestController
public class AdminOperationsController {

	//http://192.168.12.137:8181/OnlineExam2/addQuestions
		@Autowired
		private AdminOperationsService adminService;

	
	  @PostMapping(value = "/addQuestions", consumes = "application/json")
	  public void addQuestion(@RequestBody Question questions) {
	  System.out.println(questions); 
	  try { 
		  adminService.insertQuestion(questions); }
	  catch (HrException e) { 
		  e.printStackTrace(); } 
	  }
	 
		
		@GetMapping(value="/getUsersList/{state}/{city}/{levels}/{score}", produces="application/json") 
		  public @ResponseBody List<UserRegister> getUsersList(@PathVariable("state") String state, @PathVariable("city") String city, @PathVariable("levels") int levels ,@PathVariable("score") int score) { 
		  try {
			  List<UserRegister> listOfUsers = adminService.reportGeneration(state, city, levels, score);
					  return listOfUsers;
		  } 
		  	catch (HrException e) {
		  		e.printStackTrace(); 
		  		return null; //instead check how to: exception handling in spring rest/mvc
		  } 
		}
}
