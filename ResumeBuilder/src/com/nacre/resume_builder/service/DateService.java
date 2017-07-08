package com.nacre.resume_builder.service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateService {
public static Date convertDateType(String dateInput) {
	SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
	java.util.Date utilDate=null;
	try {
		utilDate = sdf.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//gives util date obj
	java.sql.Date sqlDate =new java.sql.Date(utilDate.getTime());//gives sql date
	
	return sqlDate;
}
public  Date convertUtilDateToSql(java.util.Date utilDate) {
	
	//gives util date obj
	java.sql.Date sqlDate =new java.sql.Date(utilDate.getTime());//gives sql date
	
	return sqlDate;
}
}
