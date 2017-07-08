package com.nacre.resume_builder.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nacre.resume_builder.dao.ChangePwdDAO;
import com.nacre.resume_builder.dbutil.DbUtil;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public class ChangePwdDAOImpl implements ChangePwdDAO {
private static final String UPDATE_PWD="UPDATE USERS SET PASSWORD=? WHERE EMAIL=?";
	
	@Override
	public int changePwd(String newPwd,String userName)throws ResumeBuilderDBExceptions {
		try{
			Connection con=DbUtil.getConnection();
			PreparedStatement ps=con.prepareStatement(UPDATE_PWD);
			ps.setString(1, newPwd);
			ps.setString(2, userName);
			int result=ps.executeUpdate();
			return result;
		}catch(SQLException se){
			throw new ResumeBuilderDBExceptions("Exp rel to"+se.toString());
		}
		
	}

}
