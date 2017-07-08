package com.nacre.resume_builder.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nacre.resume_builder.dao.AuthenticateUserDAO;
import com.nacre.resume_builder.dbutil.DbUtil;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public class AuthenticateUserDAOImpl implements AuthenticateUserDAO{
private static String AUTH_QUERY="SELECT COUNT(*) FROM USERS WHERE EMAIL=? AND PASSWORD=?";
private static String GET_USERID="SELECT USER_ID FROM USERS WHERE EMAIL=? AND PASSWORD=?";
@Override
	public int authenticateUser(String username, String password) throws ResumeBuilderDBExceptions {
		
		try{
			
			Connection con=DbUtil.getConnection();
			int result=0;
			ResultSet rs=null;
			PreparedStatement ps=con.prepareStatement(AUTH_QUERY);
			ps.setString(1, username);
			ps.setString(2,password);
			rs=ps.executeQuery();
			
			while(rs.next()){
				result=rs.getInt(1);
				System.out.println("result------------->"+result);
			}
			if(result>0){
				ps=con.prepareStatement(GET_USERID);
				ps.setString(1, username);
				ps.setString(2,password);
				rs=ps.executeQuery();
				
				while(rs.next()){
					result=rs.getInt(1);
				}	
				
				
				return result;//returns userid
				
			}else{
				return result;
				
			}
		}catch(SQLException e){
			//throw exception
			throw new ResumeBuilderDBExceptions("Exception related to db"+e.toString());
		}
		
	}

}
