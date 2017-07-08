package com.nacre.resume_builder.action;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import com.itextpdf.tool.xml.ElementList;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.nacre.resume_builder.dto.UserEdu_Details_DTO;
import com.nacre.resume_builder.dto.UserProject_details_DTO;
import com.nacre.resume_builder.dto.User_Tech_SkillsDTO;
import com.nacre.resume_builder.dto.UsersDTO;
import com.nacre.resume_builder.dto.UsersDetailsDTO;
import com.nacre.resume_builder.service.UserService;
@WebServlet("/pdfDownlaod")
public class ConvertToPdfSrv extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/pdf");
		HttpSession session = req.getSession();
		UsersDTO udto = null;
		Map<String, Object> user = (Map<String, Object>) session.getAttribute("user");
		// user classes for inserting details to db
		UsersDetailsDTO udetails = null;
		UserEdu_Details_DTO schooling = null;
		UserEdu_Details_DTO college = null;
		UserEdu_Details_DTO graduation = null;
		UserProject_details_DTO updto = null;
		UserProject_details_DTO up2dto = null;
		User_Tech_SkillsDTO techskills = null;
		// get user from user map obj
		udto = (UsersDTO) user.get("udto");
		// get user resume dependent objs from usermap obj
		udetails = (UsersDetailsDTO) user.get("udetails");
		schooling = (UserEdu_Details_DTO) user.get("schooling");
		college = (UserEdu_Details_DTO) user.get("college");
		graduation = (UserEdu_Details_DTO) user.get("grad");
		updto = (UserProject_details_DTO) user.get("updto");
		up2dto = (UserProject_details_DTO) user.get("up2dto");
		techskills = (User_Tech_SkillsDTO) user.get("tech");
		resp.setContentType("application/pdf"); 
		resp.setHeader("Content-Disposition","attachment; filename=\"" + udto.getFullName()+"_resume" + "\"");   

	 	OutputStream out=resp.getOutputStream();
	 	Document document = new Document();
	    // step 2
	    try {
			PdfWriter.getInstance(document, out);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // step 3
	    document.open();
	    //create string builder obj fprp holding html content
	    StringBuilder sb = new StringBuilder();
	    sb.append("<div>\n<p align=\"center\">");
	    sb.append("<font size=\"5\">");
	    sb.append("<b>&nbsp;<font color=\"black\">CV</font></b>");
	    sb.append("</font>");
	    sb.append("<font color=\"#32cd32\">&nbsp;</font>");
	    sb.append("</p>\n</div>");

	    Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLDITALIC);
	    Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
	    PdfPTable table = new PdfPTable(5);
	    PdfPCell c1 = new PdfPCell(new Phrase("Stream"));
	    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(c1);
	    PdfPCell c2 = new PdfPCell(new Phrase("Name of College"));
	    c2.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(c2);
	    PdfPCell c3 = new PdfPCell(new Phrase("University/Board"));
	    c3.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(c3);
	    PdfPCell c4 = new PdfPCell(new Phrase("Date of Passing"));
	    c4.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(c4);
	    PdfPCell c5 = new PdfPCell(new Phrase("Marks(%)"));
	    c5.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table.addCell(c5);
	    table.addCell("Schooling");
	    table.addCell(schooling.getClg_or_school_name());
	    table.addCell(schooling.getBoard_of_edu());
	    table.addCell(schooling.getDop().toString());
	    table.addCell(""+schooling.getPercentage()+" ");
	    table.addCell("Intermediate");
	    table.addCell(college.getClg_or_school_name());
	    table.addCell(college.getBoard_of_edu());
	    table.addCell(college.getDop().toString());
	    table.addCell(""+college.getPercentage());
	    table.addCell("Graduation");
	    table.addCell(graduation.getClg_or_school_name());
	    table.addCell(graduation.getBoard_of_edu()); table.addCell(graduation.getDop()+""); table.addCell(""+graduation.getPercentage());
	     ElementList list = XMLWorkerHelper.parseToElementList(sb.toString(), null);
	     try {
	    for (Element element : list) {
	       
	        document.add(element);
	    }
	    

		document.add(new Paragraph(udto.getFullName()));
	   document.add(new Paragraph("Email:"+udto.getEmail()));
		document.add(new Paragraph("Contact no:"+udto.getMobileNo()));
		 DottedLineSeparator separator = new DottedLineSeparator();
	     separator.setPercentage(59500f / 523f);
	     Chunk linebreak = new Chunk(separator);
	     document.add(linebreak);
	     document.add(new Paragraph(" "));
	     Chunk underline = new Chunk("Objective: ");
	     underline.setUnderline(0.1f, -2f); //0.1 thick, -2 y-location
	     document.add(underline);
	    document.add(new Paragraph(" "));
	    	document.add(new Paragraph("-                    "+udetails.getObj()));
	    	document.add(new Paragraph(" "));
	    	Chunk underline2 = new Chunk("Strengths: ");
	        underline2.setUnderline(0.1f, -2f); //0.1 thick, -2 y-location
	    	document.add(underline2);
	    	document.add(new Paragraph(" "));
	    	document.add(new Paragraph("-                   "+udetails.getStrength()));
	    	document.add(new Paragraph(" "));
	    	Chunk underline3 = new Chunk("Habbits: ");
	        underline3.setUnderline(0.1f, -2f); //0.1 thick, -2 y-location
	    	document.add(underline3);
	    	document.add(new Paragraph("-                     "+udetails.getHabbits()));
	        
	    	document.add(new Paragraph(" "));
	    	//document.add(new Paragraph(" "));
	    	Chunk underline4 = new Chunk("Education: ");
	        underline4.setUnderline(0.1f, -2f); //0.1 thick, -2 y-location
	    	document.add(underline4);
	    	document.add(new Paragraph(" "));
	    
	    	Chunk underline5 = new Chunk("Technical Skills: ");
	        underline5.setUnderline(0.1f, -2f); //0.1 thick, -2 y-location
	    	document.add(underline5);
	    	document.add(new Paragraph("-                      "+techskills.getTechSkill()));
	    	document.add(new Paragraph(" "));
	    	/*Chapter ch=new Chapter(new Paragraph(),0);
	    	Section sec=ch.addSection(" ");
	    	sec.add(table);*/
	    	document.add(table);
	    	document.add(new Paragraph(" "));
	    	Chunk underline6 = new Chunk("Projects: ");
	        underline6.setUnderline(0.1f, -2f); //0.1 thick, -2 y-location
	    	document.add(underline6);
	    	
	    	
	    	 PdfPTable table2 = new PdfPTable(2);
	    	 
	    	    table2.addCell("Title");
	    	    table2.addCell(updto.getProjectTitle());
	    	   
	    	    
	    	    table2.addCell("Team Size");
	    	    table2.addCell(""+updto.getTeamSize());
	    	    table2.addCell("Domain");
	    	    table2.addCell(""+updto.getDomain());
	    	   
	    	    table2.addCell("Role");
	    	    table2.addCell(updto.getRole()); 
	    	    table2.addCell("Description"); table2.addCell(updto.getDescription());
	    	     	
	    	document.add(table2);
	    	
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    
		
	document.close();
	        

 				
		
	}
}
