package com.nacre.resume_builder.dao;

import com.nacre.resume_builder.dto.UserEdu_Details_DTO;
import com.nacre.resume_builder.dto.UserProject_details_DTO;
import com.nacre.resume_builder.dto.User_Tech_SkillsDTO;
import com.nacre.resume_builder.dto.UsersDTO;
import com.nacre.resume_builder.dto.UsersDetailsDTO;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public interface GetRegisteredUserDetailsDAO {
//get all registered  user details of user 
	public UsersDTO getUsersDTO(int userid)throws ResumeBuilderDBExceptions;
	public UsersDetailsDTO getUserPersonalDetails(int userid)throws ResumeBuilderDBExceptions;
	public UserProject_details_DTO getUserProject_Details(int userid)throws ResumeBuilderDBExceptions;
	public User_Tech_SkillsDTO getUSerTech_det(int userid)throws ResumeBuilderDBExceptions;
	public UserEdu_Details_DTO getUser_edu(int userid,String eduName)throws ResumeBuilderDBExceptions;
	}
