package com.lti.onlineexam.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.services.UserRegisterService;

import oracle.ucp.proxy.annotation.Post;

import com.lti.onlineexam.core.entities.UserRegister;

@CrossOrigin
@RestController
public class RegisterController {
	//http://192.168.12.137:8181/OnlineExam2/addUser
	@Autowired
	private UserRegisterService service;

	@PostMapping(value = "/addUser", consumes = "application/json")
	public void register(@RequestBody UserRegister reg) {
		System.out.println(reg);
		try {
			service.createNewUser(reg);
		} catch (HrException e) {
			e.printStackTrace();
		}
	}
	//http://localhost:8181/OnlineExam2/userList
	@GetMapping(value = "/userList", produces = "application/json") 
	public @ResponseBody ArrayList<UserRegister> getApplicantList() {
		ArrayList<UserRegister> applicantList = null;
		try {
			applicantList = service.getApplicantList();
		} catch (HrException e) {
			
			e.printStackTrace();
		}

		return applicantList;
	}
	
	//http://localhost:8181/OnlineExam2/login
	@PostMapping(value="/login",consumes="Application/Json")
	public List<UserRegister> isLogin(@RequestBody UserRegister userRegister) throws HrException{
		
		System.out.println(userRegister);
		List<UserRegister> u = service.isValid(userRegister);
		System.out.println(u.toString());
		return u;
	}
	
}
