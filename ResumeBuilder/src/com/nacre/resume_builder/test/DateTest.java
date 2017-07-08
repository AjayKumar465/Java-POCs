package com.nacre.resume_builder.test;

import java.sql.Date;

import com.nacre.resume_builder.service.DateService;

public class DateTest {
public static void main(String[] args) {
	System.out.println(DateService.convertDateType("24-12-2016"));
	Date from=DateService.convertDateType("24-12-2016");
	Date to=DateService.convertDateType("26-12-2016");
	Date in=DateService.convertDateType("25-12-2016");
	if(in.compareTo(from)>0&&in.compareTo(to)<0){
		System.out.println("task completed");
	}
	

}
}
