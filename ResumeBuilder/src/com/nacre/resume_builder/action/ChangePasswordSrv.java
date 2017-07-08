package com.nacre.resume_builder.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.resume_builder.daoimpl.ChangePwdDAOImpl;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;
@WebServlet("/changePwd")
public class ChangePasswordSrv extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession();
	
	String oldPwd=req.getParameter("oldpwd");
	String oldPwdCompare=(String)session.getAttribute("pwd");
	String newPwd=req.getParameter("newpwd");
	String userName=(String)session.getAttribute("uname");
	if(oldPwd.equals(oldPwdCompare)){
	try {
		int result=new ChangePwdDAOImpl().changePwd(newPwd, userName);
	if(result>0){
		session.setAttribute("pwd", newPwd);
		req.setAttribute("success", "password Changed SuccessFully");
		req.getRequestDispatcher("success.jsp").forward(req, resp);
	}else{
		req.getRequestDispatcher("404.jsp").forward(req, resp);
		
	}
	
		
		
	} catch (ResumeBuilderDBExceptions e) {
		
		e.printStackTrace();
	}
	}else{
			req.setAttribute("error", "Old pwd is not correct");	
			req.getRequestDispatcher("changePwd.jsp").forward(req, resp);
	}
	
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
