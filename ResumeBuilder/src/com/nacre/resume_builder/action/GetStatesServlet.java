package com.nacre.resume_builder.action;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.resume_builder.daoimpl.Get_country_state_city_DAOImpl;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

@WebServlet("/getstates")
public class GetStatesServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)  throws IOException{
		res.setContentType("application/json");
		Get_country_state_city_DAOImpl dbdao = new Get_country_state_city_DAOImpl();
String array = null;
        String name= req.getParameter("cname");
        System.out.println(name+" states");
       
			try {
				array = dbdao.getStates(name);
			} catch (ResumeBuilderDBExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
          System.out.println(array);
			res.setCharacterEncoding("UTF-8");
		    res.getWriter().write(array);;
		 
	}
}
