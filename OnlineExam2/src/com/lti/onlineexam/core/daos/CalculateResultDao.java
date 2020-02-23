package com.lti.onlineexam.core.daos;

import com.lti.onlineexam.core.entities.Question;
import com.lti.onlineexam.core.exceptions.HrException;

public interface CalculateResultDao {

	public int calculateResult(Question selectedAns) throws HrException;
}
