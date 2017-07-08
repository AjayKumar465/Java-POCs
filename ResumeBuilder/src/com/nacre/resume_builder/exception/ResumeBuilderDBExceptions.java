package com.nacre.resume_builder.exception;

import java.sql.SQLException;

@SuppressWarnings("serial")
public class ResumeBuilderDBExceptions extends Exception {
String str;
public ResumeBuilderDBExceptions(String str) {
	this.str=str;
}

public String toString() {
	return "Exception occured in dao classes"+str;
}
}
