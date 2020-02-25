package com.lti.onlineexam.core.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.onlineexam.core.exceptions.HrException;
import com.lti.onlineexam.core.daos.UserRegisterDao;
import com.lti.onlineexam.core.entities.UserRegister;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {

	@Autowired
	private UserRegisterDao dao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public boolean createNewUser(UserRegister reg) throws HrException {
		return dao.insertNewUser(reg);
	}

	@Override
	public ArrayList<UserRegister> getApplicantList() throws HrException {
		return dao.applicantDetails();	
	}

	@Override
	public List<UserRegister> isValid(UserRegister userRegister) throws HrException {
		List<UserRegister> user = dao.isValid(userRegister);
		return user;
	}
}
