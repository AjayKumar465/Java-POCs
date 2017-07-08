package com.nacre.resume_builder.exception;

import javax.servlet.ServletException;

public class ResumeBuilderActionException extends ServletException  {
     String str;
	
	public ResumeBuilderActionException(String str) {
	// TODO Auto-generated constructor stub
		this.str=str;
}
 
	@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Exception related to Action class"+str;
}
}
