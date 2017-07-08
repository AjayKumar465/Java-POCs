package com.nacre.resume_builder.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.resume_builder.daoimpl.Get_country_state_city_DAOImpl;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

@WebServlet("/getcity")
public class GetCityServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/json");
		//create dao obj for get cities
		Get_country_state_city_DAOImpl getCity = new Get_country_state_city_DAOImpl();
		String clist = null;
        //get state name from form
		String name=(String)req.getParameter("sname");
        System.out.println(name);
      
			try {
				clist = getCity.getCity(name);
			} catch (ResumeBuilderDBExceptions e) {
				e.printStackTrace();
				
			}//this methods returns citis as jsonObj
			
			System.out.println(clist);
			
			res.getWriter().write(clist);//writes the jsonObj to view Page
      }
}
