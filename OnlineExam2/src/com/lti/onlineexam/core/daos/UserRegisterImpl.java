package com.lti.onlineexam.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.lti.onlineexam.core.entities.UserRegister;
import com.lti.onlineexam.core.exceptions.HrException;


@Repository
public class UserRegisterImpl implements UserRegisterDao{
	@PersistenceContext
	private EntityManager manager;

	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean insertNewUser(UserRegister reg) throws HrException {
		manager.persist(reg);
		return true;
	}


	@Override
	public ArrayList<UserRegister> applicantDetails() throws HrException {
		String strQry = "from ureg";
		Query qry = manager.createQuery(strQry);
		List<UserRegister> applicantList = qry.getResultList();
		return (ArrayList<UserRegister>) applicantList;
	}
}
