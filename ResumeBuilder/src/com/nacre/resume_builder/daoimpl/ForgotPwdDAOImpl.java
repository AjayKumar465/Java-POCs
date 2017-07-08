package com.nacre.resume_builder.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import com.nacre.resume_builder.dao.ForgotPwdDAO;
import com.nacre.resume_builder.dbutil.DbUtil;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public class ForgotPwdDAOImpl implements ForgotPwdDAO{

	private static final String GET_FORGOT_PWD="SELECT PASSWORD FROM USERS WHERE EMAIL=?";
	@Override
	public String getPassword(String username) throws ResumeBuilderDBExceptions{
		String pwd=null;
		try{
	Connection con=DbUtil.getConnection();
	PreparedStatement ps=con.prepareStatement(GET_FORGOT_PWD);
	ps.setString(1, username);
	
	ResultSet rs=ps.executeQuery();
while(rs.next())
{
pwd=rs.getString(1);
System.out.println("pwd in dao"+pwd);
}
	return pwd;
		
		}
		catch(SQLException se){
			throw new ResumeBuilderDBExceptions("Exp rel to"+se.toString());
		}
	}

}
