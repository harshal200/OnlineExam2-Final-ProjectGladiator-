package com.lti.onlineexam.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.services.CalculateResultService;

@CrossOrigin
@RestController
public class ResultController {

	@Autowired
	private CalculateResultService resService;
	
	@PostMapping(value="/result", consumes = "application/json")
	public void calulateResult(@RequestBody Question que) {
		try {
			resService.calculateResult(que);
		}
		catch (HrException e) {
			e.printStackTrace();
		}
	}

}
