package com.nacre.resume_builder.service;

import java.sql.SQLException;

import com.nacre.resume_builder.daoimpl.RegisterUserResumeAndUser_DAOImpl;
import com.nacre.resume_builder.dto.UserEdu_Details_DTO;
import com.nacre.resume_builder.dto.UserProject_details_DTO;
import com.nacre.resume_builder.dto.User_Tech_SkillsDTO;
import com.nacre.resume_builder.dto.UsersDTO;
import com.nacre.resume_builder.dto.UsersDetailsDTO;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public class UserService {
	// if user insertion success full it'll return userid
	public int registerUser(UsersDTO udto) throws ResumeBuilderDBExceptions  {
	//returns the userid
		return new RegisterUserResumeAndUser_DAOImpl().insertUser(udto);
	}

	
	// it'll return >0 value if insertion succeeded
	public int registerUserDetails(UsersDetailsDTO udetails) throws ResumeBuilderDBExceptions {
		return new RegisterUserResumeAndUser_DAOImpl().insertUserDetails(udetails);
	}

	// it'll return >0 value if insertion succeeded
	public int registerUserProjectDetails(UserProject_details_DTO projecDetails)
			throws ResumeBuilderDBExceptions{
		return new RegisterUserResumeAndUser_DAOImpl().insertUserProjectDetails(projecDetails);
	}

	// it'll return >0 value if insertion succeeded
	public int registerUserTechSkills(User_Tech_SkillsDTO techDetails) throws ResumeBuilderDBExceptions {
		return new RegisterUserResumeAndUser_DAOImpl().insertUserTechSkills(techDetails);
		
	}

	// it'll return >0 value if insertion succeeded
	public int registerEduDetails(UserEdu_Details_DTO eduDetails) throws ResumeBuilderDBExceptions{
		return new RegisterUserResumeAndUser_DAOImpl().insertEduDetails(eduDetails);
	}

}
