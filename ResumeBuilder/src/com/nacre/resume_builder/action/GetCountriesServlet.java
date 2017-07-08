package com.nacre.resume_builder.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.resume_builder.daoimpl.Get_country_state_city_DAOImpl;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

@WebServlet("/getcountries")
public class GetCountriesServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/json");
		Get_country_state_city_DAOImpl dbdao = new Get_country_state_city_DAOImpl();
		String clist = null;
        String name=(String)req.getAttribute("cname");
        System.out.println("hi");
     
			try {
				clist = dbdao.getCountriesArray();
			} catch (ResumeBuilderDBExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    
			System.out.println(clist);
			res.getWriter().write(clist);
      }
}
