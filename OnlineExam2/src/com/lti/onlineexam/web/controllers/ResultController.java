package com.lti.onlineexam.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.onlineexam.core.entities.ExamResult;
import com.lti.onlineexam.core.entities.QueAndAns;
import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.entities.UserResponse;
import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.services.CalculateResultService;

@CrossOrigin
@RestController
public class ResultController {

	@Autowired
	private CalculateResultService resService;
	
	/*
	 * @PostMapping(value="/result", consumes = "application/json") public void
	 * calulateResult(@RequestBody Question que) { try {
	 * resService.calculateResult(que); } catch (HrException e) {
	 * e.printStackTrace(); } }
	 */
	
	/*
	 * @GetMapping(value="/submitAnswer/{questionId}/{selectedAns}",
	 * produces="application/json") public @ResponseBody Question
	 * getqIdAndSelectedAns(@PathVariable("questionId") int
	 * questionId, @PathVariable("selectedAns") String selectedAns) { try { Question
	 * score = resService.calculateResult(questionId, selectedAns); return score; }
	 * catch (HrException e) { e.printStackTrace(); //instead check how to:
	 * exception handling in spring rest/mvc //return 0; } }
	 */
	
//	@PostMapping(value="/submitAnswer",produces="application/json")
//	public @ResponseBody ExamResult calResult(@RequestBody UserResponse response) {
//		try {
//			UserResponse userResponse = resService.calculateResult(response);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	@PostMapping(value="/submitAnswer",produces="application/json")
	public int getResult(@RequestBody List<QueAndAns> queAndAns) throws HrException {	
		 List<UserResponse> uRes = new ArrayList<>();
		 System.out.println(queAndAns);
		 int score = resService.fetch(queAndAns);
		 System.out.println(score);
		 //resService.calculateResult(queAndAns);
		return score;
	}
}
