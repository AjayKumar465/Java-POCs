package com.nacre.resume_builder.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import com.nacre.resume_builder.dao.GetRegisteredUserDetailsDAO;
import com.nacre.resume_builder.dbutil.DbUtil;
import com.nacre.resume_builder.dto.UserEdu_Details_DTO;
import com.nacre.resume_builder.dto.UserProject_details_DTO;
import com.nacre.resume_builder.dto.User_Tech_SkillsDTO;
import com.nacre.resume_builder.dto.UsersDTO;
import com.nacre.resume_builder.dto.UsersDetailsDTO;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public class GetRegisteredUserDetailsDAOImpl implements GetRegisteredUserDetailsDAO{
	private static final String  GET_USERSDTO="SELECT * FROM USERS WHERE USER_ID=?";
	private static final String  GET_USER="SELECT * FROM USER_DETAILS WHERE USER_ID=?";
	private static final String  GET_USER_EDU_DETAILS="SELECT * FROM USER_EDUCATION_DETAILS WHERE USER_ID=? AND STREAM=?";
	private static final String  GET_USER_PROJ="SELECT * FROM USER_PROJECT WHERE USER_ID=?";
    private static final String  GET_USER_TECH="SELECT * FROM USER_TECH_SKILLS WHERE USER_ID=?";
	@Override
	public UsersDTO getUsersDTO(int userid) throws ResumeBuilderDBExceptions {
	try{
			Connection con=DbUtil.getConnection();
			UsersDTO udto=new UsersDTO();
			ResultSet rs=null;
			java.sql.PreparedStatement ps=con.prepareStatement(GET_USERSDTO);
			
			ps.setInt(1, userid);
			rs=ps.executeQuery();
			while(rs.next()){
				udto.setFullName(rs.getString(2));
				udto.setEmail(rs.getString(3));
				udto.setMobileNo(rs.getLong(4));
			}
			return udto;
		}catch(SQLException e){
			throw new ResumeBuilderDBExceptions("DB");
		}
		
		
	}

	@Override
	public UsersDetailsDTO getUserPersonalDetails(int userid) throws ResumeBuilderDBExceptions {
		try{
			Connection con=DbUtil.getConnection();
			UsersDetailsDTO udetials=new UsersDetailsDTO();
			ResultSet rs=null;
			java.sql.PreparedStatement ps=con.prepareStatement(GET_USER);
			
			ps.setInt(1, userid);
			rs=ps.executeQuery();
			while(rs.next()){
				udetials.setDate(rs.getDate(2));
				udetials.setEntryLevel(rs.getString(3));
				udetials.setStrength(rs.getString(4));
				udetials.setAddress(rs.getString(5));
				udetials.setCoutnry(rs.getString(6));
				udetials.setState(rs.getString(7));
				udetials.setCity(rs.getString(8));
				udetials.setHabbits(rs.getString(9));
				udetials.setPhotoPath(rs.getString(10));
			    udetials.setObj(rs.getString(11));
			}
			return udetials;
		}catch(SQLException e){
			throw new ResumeBuilderDBExceptions("DB"+e.toString());
		}
	}

	@Override
	public UserProject_details_DTO getUserProject_Details(int userid) throws ResumeBuilderDBExceptions {
		try{
			Connection con=DbUtil.getConnection();
			UserProject_details_DTO updto=new UserProject_details_DTO();
			ResultSet rs=null;
			java.sql.PreparedStatement ps=con.prepareStatement(GET_USER_PROJ);
			
			ps.setInt(1, userid);
			rs=ps.executeQuery();
			while(rs.next()){
			updto.setProjectTitle(rs.getString(2));
			updto.setDomain(rs.getString(3));
			updto.setTeamSize(rs.getInt(4));
			updto.setRole(rs.getString(5));
			updto.setDescription(rs.getString(6));
			}
			return updto;
		}catch(SQLException e){
			throw new ResumeBuilderDBExceptions("DB"+e.toString());
		}
	}

	@Override
	public User_Tech_SkillsDTO getUSerTech_det(int userid) throws ResumeBuilderDBExceptions {
		try{
			Connection con=DbUtil.getConnection();
			User_Tech_SkillsDTO utech=new User_Tech_SkillsDTO();
			PreparedStatement ps=con.prepareStatement(GET_USER_TECH);
			ps.setInt(1, userid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				utech.setTechSkill(rs.getString(2));
			}
			
			return utech;
		}catch(SQLException se){
			throw new ResumeBuilderDBExceptions("db"+se.toString());
		}
	}

	@Override
	public UserEdu_Details_DTO getUser_edu(int userid, String eduName) throws ResumeBuilderDBExceptions {
        try{
        	Connection con=DbUtil.getConnection();
        	UserEdu_Details_DTO uedu=new UserEdu_Details_DTO();
             java.sql.PreparedStatement ps=con.prepareStatement(GET_USER_EDU_DETAILS);
             ps.setInt(1, userid);
        	ps.setString(2, eduName);
        	ResultSet rs=ps.executeQuery();
        	while(rs.next()){
        		uedu.setEducation_level(rs.getString(2));
        		uedu.setClg_or_school_name(rs.getString(3));
        		uedu.setBoard_of_edu(rs.getString(4));
        		uedu.setDop(rs.getDate(5));
        		uedu.setPercentage(rs.getFloat(6));
        		
        	}
        	return uedu;
        }catch(SQLException se){
        throw new ResumeBuilderDBExceptions("db"+se.toString());
        }
		
	
	}


	
}
