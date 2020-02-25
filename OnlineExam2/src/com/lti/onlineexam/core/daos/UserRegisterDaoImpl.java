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
public class UserRegisterDaoImpl implements UserRegisterDao{
	@PersistenceContext
	private EntityManager manager;


	//------------To Insert new user-----------------//
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean insertNewUser(UserRegister reg) throws HrException {
		manager.merge(reg);
		return true;
	}


	//-------------- To verify if user is valid or not---------------
	@Override
	public List<UserRegister> isValid(UserRegister userRegister) {
		System.out.println(userRegister.getEmail());
		String q = "select e from UserRegister e where e.email=:u and e.password=:p";
		Query qq = manager.createQuery(q);
		qq.setParameter("u", userRegister.getEmail());
		qq.setParameter("p", userRegister.getPassword());
		List<UserRegister> user = qq.getResultList();
		List<UserRegister> u = new ArrayList<>();
		if(user.isEmpty())
			return u;
		else
			return user;
		
	}
	
	//------------------To extract user list--------------------
	
	@Override
	public ArrayList<UserRegister> applicantDetails() throws HrException {
		String strQry = "from UserRegister";
		Query qry = manager.createQuery(strQry);
		List<UserRegister> applicantList = qry.getResultList();
		return (ArrayList<UserRegister>) applicantList;
	}
}
