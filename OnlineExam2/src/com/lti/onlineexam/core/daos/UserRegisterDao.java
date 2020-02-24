package com.lti.onlineexam.core.daos;

import java.util.ArrayList;
import java.util.List;

import com.lti.onlineexam.core.entities.UserRegister;
import com.lti.onlineexam.core.exceptions.HrException;


public interface UserRegisterDao {
	
	public boolean insertNewUser(UserRegister reg) throws HrException; 
	public ArrayList<UserRegister> applicantDetails() throws HrException;
	public List<UserRegister> isValid(UserRegister userRegister) throws HrException;
}
