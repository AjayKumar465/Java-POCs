package com.nacre.resume_builder.service;

import java.util.HashMap;
import java.util.Map;

import com.nacre.resume_builder.dao.AuthenticateUserDAO;
import com.nacre.resume_builder.dao.GetRegisteredUserDetailsDAO;
import com.nacre.resume_builder.daoimpl.AuthenticateUserDAOImpl;
import com.nacre.resume_builder.daoimpl.GetRegisteredUserDetailsDAOImpl;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public class RegisteredUserService {
	private static GetRegisteredUserDetailsDAO regimpl = null;
	private static AuthenticateUserDAO authenticate = null;

	public int checkUser(String email, String mobileno) throws ResumeBuilderDBExceptions {
		authenticate = new AuthenticateUserDAOImpl();
		return authenticate.authenticateUser(email, mobileno);

	}

	public Map<String, Object> getUserAllDetails(int userid) throws ResumeBuilderDBExceptions {
		regimpl = new GetRegisteredUserDetailsDAOImpl();
		Map<String, Object> map = new HashMap<>();
		map.put("udetails", regimpl.getUserPersonalDetails(userid));
		map.put("udto", regimpl.getUsersDTO(userid));
		map.put("schooling", regimpl.getUser_edu(userid, "schooling"));
		map.put("college", regimpl.getUser_edu(userid, "Intermediate"));
		map.put("grad", regimpl.getUser_edu(userid, "Graduation"));
		map.put("updto", regimpl.getUserProject_Details(userid));
		map.put("up2dto", null);
		map.put("tech", regimpl.getUSerTech_det(userid));
		return map;
	}
}
