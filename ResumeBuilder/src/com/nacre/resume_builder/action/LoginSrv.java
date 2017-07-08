package com.nacre.resume_builder.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.resume_builder.exception.ResumeBuilderActionException;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;
import com.nacre.resume_builder.service.RegisteredUserService;
@WebServlet("/login")
public class LoginSrv extends HttpServlet {
private static final long serialVersionUID = 1L;
@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
     RegisteredUserService regSer=null;
     Map<String,Object> map=null;
     //Session
     HttpSession session=req.getSession(false);
     int userid=0;
     //get form data
	 String uname=req.getParameter("uname");
     String pwd=req.getParameter("pwd");
     
     regSer=new RegisteredUserService();
     try {
    	 //call service class method for checking registered user or not 
    	 userid=regSer.checkUser(uname, pwd);
		if(userid>0&&session!=null){
			map=regSer.getUserAllDetails(userid);
			session=req.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("pwd", pwd);
			if(map!=null){
			session.setAttribute("user", map);
			req.getRequestDispatcher("user_home.jsp").forward(req, resp);
			}else{
				req.setAttribute("error", "some internal problem try again later");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}
		}else{
			req.setAttribute("error", "provide valid credentials");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	} catch (ResumeBuilderDBExceptions e) {
		e.printStackTrace();
	}

}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
