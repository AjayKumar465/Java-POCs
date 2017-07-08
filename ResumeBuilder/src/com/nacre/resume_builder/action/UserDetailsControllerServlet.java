package com.nacre.resume_builder.action;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.resume_builder.dto.UserEdu_Details_DTO;
import com.nacre.resume_builder.dto.UserProject_details_DTO;
import com.nacre.resume_builder.dto.User_Tech_SkillsDTO;
import com.nacre.resume_builder.dto.UsersDTO;
import com.nacre.resume_builder.dto.UsersDetailsDTO;
import com.nacre.resume_builder.service.DateService;
import com.nacre.resume_builder.service.UserService;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadException;
@WebServlet("/setUdetails")
public class UserDetailsControllerServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	UsersDTO udto=new UsersDTO();
	String photoPath=null;
	
	HttpSession session=req.getSession();
	//for storing user details as map
    Map<String, Object> map=new HashMap<>();
//for converting string format date to sql date
    DateService ds=new DateService();
    //to send user data through network 
	 UsersDetailsDTO udetails=new UsersDetailsDTO();
	 UserEdu_Details_DTO schooling=new UserEdu_Details_DTO();
	 UserEdu_Details_DTO college=new UserEdu_Details_DTO();
	 UserEdu_Details_DTO graduation=new UserEdu_Details_DTO();
    UserProject_details_DTO updto=null;
    UserProject_details_DTO up2dto=null;
    User_Tech_SkillsDTO techskills=new User_Tech_SkillsDTO();
    //get user data from form and stroring in dto
    udto.setEmail(req.getParameter("email"));
    udto.setFullName(req.getParameter("uname"));
    System.out.println(udto.getEmail()+"udto");
    udto.setMobileNo(Long.parseLong(req.getParameter("mno")));
    udetails.setDate(ds.convertDateType(req.getParameter("dob")));	
    udetails.setAddress(req.getParameter("uadd"));
    udetails.setCoutnry(req.getParameter("ucountry"));
    udetails.setState(req.getParameter("ustate"));
    udetails.setCity(req.getParameter("ucity"));
    udetails.setEntryLevel(req.getParameter("entry-level"));
    udetails.setHabbits(req.getParameter("habbit"));
    udetails.setObj(req.getParameter("userObj"));
    udetails.setStrength(req.getParameter("strength"));
    photoPath=(String) session.getAttribute("pic");
    if(photoPath!=null)
    	udetails.setPhotoPath(photoPath);
    
    /*  */ 
    	schooling.setBoard_of_edu(req.getParameter("sboard"));
  		schooling.setClg_or_school_name(req.getParameter("school_name"));
  		schooling.setDop(ds.convertDateType(req.getParameter("sdop")));
  		schooling.setPercentage(Float.parseFloat(req.getParameter("um")));
  		college.setBoard_of_edu(req.getParameter("cboard"));
  		college.setClg_or_school_name(req.getParameter("college_name"));
  		college.setDop(ds.convertDateType(req.getParameter("cdop")));
  		college.setPercentage(Float.parseFloat(req.getParameter("cm")));
  		graduation.setBoard_of_edu(req.getParameter("grad_board"));
  		graduation.setClg_or_school_name(req.getParameter("grad_clg_name"));
  		graduation.setDop(ds.convertDateType(req.getParameter("grad_dop")));
  		graduation.setPercentage(Float.parseFloat(req.getParameter("grad_marks")));
  		updto=new UserProject_details_DTO();
  		updto.setProjectTitle(req.getParameter("pro1-title"));
  		updto.setDomain(req.getParameter("pro1-domain"));
  		updto.setRole(req.getParameter("pro1-role"));
	    updto.setTeamSize(Integer.parseInt(req.getParameter("pro1-tsize")));
	    updto.setDescription(req.getParameter("pro1-desc"));
	  //set edu levels of users
		schooling.setEducation_level("schooling");
		college.setEducation_level("Intermediate");
		graduation.setEducation_level("Graduation");
		
	    if(req.getParameter("pro2-title")!=null){
	    	up2dto=new UserProject_details_DTO();
	    	updto.setProjectTitle(req.getParameter("pro2-title"));
	  		updto.setDomain(req.getParameter("pro2-domain"));
	  		updto.setRole(req.getParameter("pro2-role"));
		    updto.setTeamSize(Integer.parseInt(req.getParameter("pro2-tsize")));
		    updto.setDescription(req.getParameter("pro2-desc"));
		 }
	    techskills.setTechSkill(req.getParameter("tech_skills"));
	    map.put("udetails", udetails);
	    map.put("udto", udto);
	    map.put("schooling", schooling);
	    map.put("college",college);
	    map.put("grad", graduation);
	    map.put("updto", updto);
	    map.put("up2dto", up2dto);
	    map.put("tech", techskills);    
	    //store user map obj in session for manipulating data 
	    session.setAttribute("user", map);
   	   req.getRequestDispatcher("upload_Photo.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
