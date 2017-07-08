package com.nacre.resume_builder.dao;



import com.nacre.resume_builder.dto.UserEdu_Details_DTO;
import com.nacre.resume_builder.dto.UserProject_details_DTO;
import com.nacre.resume_builder.dto.User_Tech_SkillsDTO;
import com.nacre.resume_builder.dto.UsersDTO;
import com.nacre.resume_builder.dto.UsersDetailsDTO;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;


public interface RegisterUserResumeAndUser_DAO{
//if user insertion success full it'll return userid
public int insertUser(UsersDTO udto)throws ResumeBuilderDBExceptions;
//it'll return >0 value if insertion succeded
public int insertUserDetails(UsersDetailsDTO udetails)throws ResumeBuilderDBExceptions;
//it'll return >0 value if insertion succeded
public int insertUserProjectDetails(UserProject_details_DTO projecDetails)throws ResumeBuilderDBExceptions;
//it'll return >0 value if insertion succeded
public int insertUserTechSkills(User_Tech_SkillsDTO techDetails)throws ResumeBuilderDBExceptions;
//it'll return >0 value if insertion succeded
public int insertEduDetails(UserEdu_Details_DTO eduDetails)throws ResumeBuilderDBExceptions; 

}
