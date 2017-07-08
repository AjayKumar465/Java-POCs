package com.nacre.resume_builder.action;

import java.io.IOException;
import java.sql.SQLException;
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
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;
import com.nacre.resume_builder.mailer.SendMail;
import com.nacre.resume_builder.service.UserService;

@WebServlet("/submitResume")
public class SubmitResumeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get session f
		HttpSession session = req.getSession();
		UsersDTO udto = null;
		Map<String, Object> user = (Map<String, Object>) session.getAttribute("user");
		// user classes for inserting details to db
		UsersDetailsDTO udetails = null;
		int userid = 0;
		int result1=0,result2=0,result3=0,result4=0,result5=0,result6=0;
		UserEdu_Details_DTO schooling = null;
		UserEdu_Details_DTO college = null;
		UserEdu_Details_DTO graduation = null;
		UserProject_details_DTO updto = null;
		UserProject_details_DTO up2dto = null;
		User_Tech_SkillsDTO techskills = null;
		  // SMTP info
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "ajayajayk465@gmail.com";
        String password = "ajay18811";
 
        // message info
        String mailTo = null;
        String subject = null;
        String message = null;
 
		// user service class
		UserService uservice = null;
		// get user from user map obj
		udto = (UsersDTO) user.get("udto");
		udto.setPwd(""+udto.getMobileNo());
		// create obj of service
		uservice = new UserService();
		try {
			
			
			if(udto!=null)
				// it returns the userid
			userid = uservice.registerUser(udto);
			else
				System.out.println(udto);
			if(userid!=0){
				System.out.println("userid"+userid);
			// get user resume dependent objs from usermap obj
			udetails = (UsersDetailsDTO) user.get("udetails");
			schooling = (UserEdu_Details_DTO) user.get("schooling");
			college = (UserEdu_Details_DTO) user.get("college");
			graduation = (UserEdu_Details_DTO) user.get("grad");
			updto = (UserProject_details_DTO) user.get("updto");
			up2dto = (UserProject_details_DTO) user.get("up2dto");
			techskills = (User_Tech_SkillsDTO) user.get("tech");
			// set userid to all dependent objs
			udetails.setUserid(userid);
			udetails.setUserid(userid);
			schooling.setUserid(userid);
			
			college.setUserid(userid);
			
			graduation.setUserid(userid);

			updto.setUserid(userid);
			techskills.setUserid(userid);
			// call service methods for insertions
			
  result1= uservice.registerUserDetails(udetails); 
 result2=  uservice.registerEduDetails(schooling);
  result3= uservice.registerEduDetails(college);
 result4=  uservice.registerEduDetails(graduation);
  result5= uservice.registerUserProjectDetails(updto);
 result6=  uservice.registerUserTechSkills(techskills);
 if(result1!=0&&result2!=0&&result3!=0&&result4!=0&&result5!=0&&result6!=0){
	 mailTo=udto.getEmail(); 
	 subject="Resume Builder";
	 message="From<br> <br>Resume Builder<br><br><br>Your resume has been created.<br>user<a href='http://localhost:7777/ResumeBuilder/login.jsp'>click here to ligin</a>"
	 		+ "<br><br><br><br>Thanks And Regards<br>Resume Builder<br><a href='http://localhost:7777/ResumeBuilder'>www.resumebuilder.com</a>";
	 try{
          SendMail.sendEmailWithAttachments(host, port, mailFrom, password, mailTo,
              subject, message);
          System.out.println("Email sent.");
      } catch (Exception ex) {
          System.out.println("Could not send email.");
          ex.printStackTrace();
      } 
	 
	 
	 
	 
	 
	 
	 req.getRequestDispatcher("result_popup.jsp").forward(req, resp);
 }else
 {
	 System.out.println(result1+"/n"+result2+"/n"+result3+"/n"+result4+"/n"+result5+"/n"+result6);
 }
 
 
			}
		} catch (ResumeBuilderDBExceptions e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		
		}

	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
