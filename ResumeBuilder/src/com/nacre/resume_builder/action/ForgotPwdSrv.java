package com.nacre.resume_builder.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.resume_builder.dao.ForgotPwdDAO;
import com.nacre.resume_builder.daoimpl.ForgotPwdDAOImpl;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;
@WebServlet("/forgotPwd")
public class ForgotPwdSrv extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     	String email=req.getParameter("uname");
	     	System.out.println(email);
	     	String pwd=null;
		     try {
				pwd=new ForgotPwdDAOImpl().getPassword(email);
			} catch (ResumeBuilderDBExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(pwd!=null){
			System.out.println(pwd);
			req.setAttribute("success", "your passowrd is "+pwd);
			req.getRequestDispatcher("success.jsp").forward(req, resp);
		}else{
			req.setAttribute("error", "user name doen't exist or provide valid emial");
			req.getRequestDispatcher("forgotpwd.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     doPost(req, resp);
	}

}
