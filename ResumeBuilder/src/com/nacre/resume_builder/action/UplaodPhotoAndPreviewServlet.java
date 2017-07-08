package com.nacre.resume_builder.action;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.resume_builder.dto.UsersDetailsDTO;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadBean;
import javazoom.upload.UploadException;
import javazoom.upload.UploadFile;


@WebServlet("/preview")
public class UplaodPhotoAndPreviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String photoPath = "E:/MiniProj/ResumeBuilder//WebContent/images";
	HttpSession session=request.getSession();
	Map<String,Object> map=(Map<String,Object>) session.getAttribute("user");
	UsersDetailsDTO uDetails=(UsersDetailsDTO) map.get("udetails");
	
	UploadBean upb=new UploadBean();
	
	try {
		upb.setFolderstore(photoPath);
	} catch (UploadException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
		try {
	  		  //Special Request obj
				MultipartFormDataRequest mfdreq=new MultipartFormDataRequest(request);
				
				Enumeration e=(Enumeration) mfdreq.getFiles().elements();
			
				
					//Perform file uploading
					upb.store(mfdreq);
				photoPath="images/";	
				while(e.hasMoreElements()){
					UploadFile file=(UploadFile)e.nextElement();
					
					photoPath=photoPath+file.getFileName();
				}//while
			} catch (UploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			uDetails.setPhotoPath(photoPath);
			map.put("udetials", uDetails);
			session.setAttribute("user", map);
			session.setAttribute("pic", photoPath);
	  System.out.println(photoPath);
		request.getRequestDispatcher("view_res.jsp").forward(request, response);
		
			}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

}
