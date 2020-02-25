package com.lti.onlineexam.core.services;

import java.util.ArrayList;
import java.util.List;

import com.lti.onlineexam.core.entities.UserRegister;
import com.lti.onlineexam.core.exceptions.HrException;

public interface UserRegisterService {
	public boolean createNewUser(UserRegister reg) throws HrException;
	public ArrayList<UserRegister> getApplicantList() throws HrException;
	public List<UserRegister> isValid(UserRegister userRegister) throws HrException;
	
	
}
