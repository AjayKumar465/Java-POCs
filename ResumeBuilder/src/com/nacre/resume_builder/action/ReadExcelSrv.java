package com.nacre.resume_builder.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.nacre.resume_builder.dto.UserEdu_Details_DTO;
import com.nacre.resume_builder.dto.UserProject_details_DTO;
import com.nacre.resume_builder.dto.User_Tech_SkillsDTO;
import com.nacre.resume_builder.dto.UsersDTO;
import com.nacre.resume_builder.dto.UsersDetailsDTO;
import com.nacre.resume_builder.service.DateService;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadException;
import javazoom.upload.UploadFile;

@WebServlet("/excel")
public class ReadExcelSrv extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		// for storing user details as map 
		Map<String, Object> excelUser = new HashMap<>();
		//for string user dtos's details in map
		Map<String, Object> map = new HashMap<>();
        //Date service
		DateService dateService=new DateService();
		UsersDTO udto = new UsersDTO();
		int i=0;
		
		// to send user data through network
		UsersDetailsDTO udetails = new UsersDetailsDTO();
		UserEdu_Details_DTO schooling = new UserEdu_Details_DTO();
		UserEdu_Details_DTO college = new UserEdu_Details_DTO();
		UserEdu_Details_DTO graduation = new UserEdu_Details_DTO();
		UserProject_details_DTO updto = null;
		UserProject_details_DTO up2dto = null;
		User_Tech_SkillsDTO techskills = new User_Tech_SkillsDTO();
		//to store and manipulate user data from excel 
		Map<Integer,List<Object>> excelDet=new HashMap<>();
		List<Object> celList=null;
		// get user data from Excel and stroring in dto
		InputStream file =null;
		try {
			// getting patho of client excel file and set to fis
			System.out.println(req.getParameter("excel"));
			 //Special Request obj
			MultipartFormDataRequest mfdreq=null;
			try {
				mfdreq = new MultipartFormDataRequest(req);
				Enumeration e=(Enumeration) mfdreq.getFiles().elements();
				
				while(e.hasMoreElements()){
					UploadFile file2=(UploadFile)e.nextElement();
					file=file2.getInpuStream() ;
				}
				
				
				
			} catch (UploadException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		//= new FileInputStream(new File(req.getParameter("excel")));

			//System.out.println(file.getChannel());
			// Get the workbook instance for XLS file
			HSSFWorkbook workbook = new HSSFWorkbook(file);

			//Get first sheet from the workbook
			HSSFSheet sheet = workbook.getSheetAt(0);

			// Iterate through each rows from first sheet
			Iterator<Row> rowIterator = sheet.iterator();
	
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				//for every row one arrayList obj
				 celList=new ArrayList();
				// For each row, iterate through each columns
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
                         
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t\t");
						celList.add(cell.getBooleanCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						if (HSSFDateUtil.isCellDateFormatted(cell)) {
							celList.add(cell.getDateCellValue());
							System.out.println(cell.getDateCellValue());
						} else {
							celList.add(cell.getNumericCellValue());
							System.out.print(cell.getNumericCellValue() + "\t\t 2");
						}
						break;
					case Cell.CELL_TYPE_STRING:
						celList.add(cell.getStringCellValue());
						System.out.print(cell.getStringCellValue() + "\t\t");
						break;
					}
				}
				System.out.println("");
				//add every cellist int map
			excelDet.put(i++, celList);
			//for dev
 System.out.println(i);				
			}
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//1st row of excel and setting that data into user dtos
		celList=excelDet.get(0);
		udto.setEmail((String)celList.get(3));
		udto.setFullName((String)celList.get(1));
		Double d=(Double)celList.get(2);
		udto.setMobileNo(d.longValue());
		udetails.setEntryLevel((String)celList.get(0));
		udetails.setDate(dateService.convertUtilDateToSql((Date)celList.get(4)));
		udetails.setCoutnry((String)celList.get(5));
		udetails.setState((String)celList.get(6));
		udetails.setCity((String)celList.get(7));
		udetails.setAddress((String)celList.get(8));
	    //2nd row
		celList=excelDet.get(1);
	    udetails.setObj((String)celList.get(0));
	    udetails.setStrength((String)celList.get(2));
	    udetails.setHabbits((String)celList.get(1));
	    //3rd row
	    celList=excelDet.get(2);
	    schooling.setEducation_level("schooling");
	    schooling.setClg_or_school_name((String)celList.get(0));
	    schooling.setBoard_of_edu((String)celList.get(1));
	    schooling.setDop(dateService.convertUtilDateToSql((Date)celList.get(2)));
	    d=(Double) celList.get(3);
	    schooling.setPercentage(d.intValue());
	    //4th row
	    celList=excelDet.get(3);
	    college.setEducation_level("college");
	    college.setClg_or_school_name((String)celList.get(0));
	    college.setBoard_of_edu((String)celList.get(1));
	    college.setDop(dateService.convertUtilDateToSql((Date)celList.get(2)));
	    d=(Double) celList.get(3);
	    college.setPercentage(d.intValue());
	    //5th row
	    celList=excelDet.get(4);
	    graduation.setEducation_level("graduation");
	    graduation.setClg_or_school_name((String)celList.get(0));
	    graduation.setBoard_of_edu((String)celList.get(1));
	    graduation.setDop(dateService.convertUtilDateToSql((Date)celList.get(2)));
	    d=(Double) celList.get(3);
	    graduation.setPercentage(d.intValue());
        //6th row
	    celList=excelDet.get(5);
	    updto=new UserProject_details_DTO();
	    updto.setDescription((String)celList.get(4));
	    updto.setProjectTitle((String)celList.get(0));
	    updto.setDomain((String)celList.get(1));
	    updto.setRole((String)celList.get(2));
	    d=(Double) celList.get(3);
	    updto.setTeamSize(d.intValue());
	    //7th row
	    celList=excelDet.get(6);
	    techskills.setTechSkill((String)celList.get(0));
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
   	   req.getRequestDispatcher("edit_resume_form.jsp").forward(req, resp);

	    
	    
	    
	    
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
