package com.nacre.resume_builder.daoimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nacre.resume_builder.dao.RegisterUserResumeAndUser_DAO;

import com.nacre.resume_builder.dbutil.DbUtil;
import com.nacre.resume_builder.dto.UserEdu_Details_DTO;
import com.nacre.resume_builder.dto.UserProject_details_DTO;
import com.nacre.resume_builder.dto.User_Tech_SkillsDTO;
import com.nacre.resume_builder.dto.UsersDTO;
import com.nacre.resume_builder.dto.UsersDetailsDTO;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public class RegisterUserResumeAndUser_DAOImpl implements RegisterUserResumeAndUser_DAO {

	
	
	private static Connection con =null;
	// sql quries for manipilation data using our application
	private static final String INSERT_USER = "INSERT INTO USERS(FULL_NAME,EMAIL,MOBILE_NO_PASS,PASSWORD) VALUES(?,?,?,?)";
	private static final String GET_USERID = "SELECT USER_ID FROM USERS WHERE EMAIL=?";
	private static final String INSERTUSERDETAILS = "INSERT INTO USER_DETAILS VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String INSERT_PROJECT_DETAILS = "INSERT INTO USER_PROJECT VALUES(?,?,?,?,?,?)";
	private static final String INSERT_EDU_DETAILS = "INSERT INTO USER_EDUCATION_DETAILS VALUES(?,?,?,?,?,?)";
	private static final String INSERT_TECH_DETAILS = "INSERT INTO USER_TECH_SKILLS VALUES(?,?)";

	@Override
	public int insertUser(UsersDTO udto)throws ResumeBuilderDBExceptions {
	try{
		PreparedStatement ps = null;
		con=DbUtil.getConnection();
		ps = con.prepareStatement(INSERT_USER);
		//set the dto into ps
		ps.setString(1, udto.getFullName());
		ps.setString(2, udto.getEmail());
		ps.setLong(3, udto.getMobileNo());
		ps.setString(4,udto.getPwd());
		int result = ps.executeUpdate();
		if (result > 0) {
			ps = con.prepareStatement(GET_USERID);
			ps.setString(1, udto.getEmail());
			//get the resulset
			ResultSet rs = ps.executeQuery();
			int userid = 0;
			while (rs.next())
				userid = rs.getInt(1);
			return userid;
		} else {

			return result;
		}
	}catch(SQLException se){
		throw new ResumeBuilderDBExceptions("Exception related to "+se.toString());
	}

	}

	@Override
	public int insertUserDetails(UsersDetailsDTO udetails) throws ResumeBuilderDBExceptions {
		try{
			con=DbUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(INSERTUSERDETAILS);
		
		ps.setInt(1, udetails.getUserid());
		ps.setDate(2, (Date) udetails.getDate());
		ps.setString(3, udetails.getEntryLevel());
		ps.setString(4, udetails.getStrength());
		ps.setString(5, udetails.getAddress());
		ps.setString(6, udetails.getCoutnry());
		ps.setString(7, udetails.getState());
		ps.setString(8, udetails.getCity());
		ps.setString(9, udetails.getHabbits());
		ps.setString(10, udetails.getPhotoPath());
		ps.setString(11, udetails.getObj());
		int result = ps.executeUpdate();
		return result;
	}catch(SQLException se){
		throw new ResumeBuilderDBExceptions("Exception related to "+se.toString());
	}
	}

	@Override
	public int insertUserProjectDetails(UserProject_details_DTO projecDetails)
			throws ResumeBuilderDBExceptions {
		try{
			con=DbUtil.getConnection()
					;
		PreparedStatement ps = con.prepareStatement(INSERT_PROJECT_DETAILS);
		ps.setInt(1, projecDetails.getUserid());
		ps.setString(2, projecDetails.getProjectTitle());
		ps.setString(3, projecDetails.getDomain());
		ps.setInt(4, projecDetails.getTeamSize());
		ps.setString(5, projecDetails.getRole());
		ps.setString(6, projecDetails.getDescription());

		int result = ps.executeUpdate();
		return result;
	}catch(SQLException se){
		throw new ResumeBuilderDBExceptions("Exception related to "+se.toString());
	}
	}

	@Override
	public int insertUserTechSkills(User_Tech_SkillsDTO techDetails) throws ResumeBuilderDBExceptions {
		try{
			con=DbUtil.getConnection();
		PreparedStatement ps=con.prepareStatement(INSERT_TECH_DETAILS);
		ps.setInt(1, techDetails.getUserid());
		ps.setString(2, techDetails.getTechSkill());
		return ps.executeUpdate();
		}catch(SQLException se){
			throw new ResumeBuilderDBExceptions("Exception related to "+se.toString());
		}
	}

	@Override
	public int insertEduDetails(UserEdu_Details_DTO eduDetails) throws ResumeBuilderDBExceptions {
		try{
			con=DbUtil.getConnection();
		PreparedStatement ps=con.prepareStatement(INSERT_EDU_DETAILS);
		ps.setInt(1, eduDetails.getUserid());
		ps.setString(2, eduDetails.getEducation_level());
		ps.setString(3, eduDetails.getClg_or_school_name());
		ps.setString(4, eduDetails.getBoard_of_edu());
		ps.setDate(5, (Date) eduDetails.getDop());
		ps.setFloat(6, eduDetails.getPercentage());
		
		return ps.executeUpdate();
	}catch(SQLException se){
		throw new ResumeBuilderDBExceptions("Exception related to "+se.toString());
	}
	}

}
