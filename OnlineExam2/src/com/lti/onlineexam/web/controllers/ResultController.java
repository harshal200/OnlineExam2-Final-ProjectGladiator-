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


	@PostMapping(value="/submitAnswer",produces="application/json")
	public int getResult(@RequestBody List<QueAndAns> queAndAns) throws HrException {	
		 List<UserResponse> uRes = new ArrayList<>();
		 System.out.println(queAndAns);
		 int score = resService.fetch(queAndAns);
		 System.out.println(score);
		 //resService.calculateResult(queAndAns);
		return score;
	}
	
//	@PostMapping(value="/submitAnswer",produces="application/json")
//	public int getResult(@RequestBody UserResponse queAndAns) throws HrException {	
//		 List<UserResponse> uRes = new ArrayList<>();
//		 System.out.println(queAndAns);
//		 int score = resService.fetch(queAndAns);
//		 System.out.println(score);
//		 //resService.calculateResult(queAndAns);
//		return score;
//	}
}
