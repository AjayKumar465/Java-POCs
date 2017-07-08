package com.nacre.resume_builder.dto;

import java.io.Serializable;

public class UsersDTO implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	// properties of user
	private String fullName;
	private String email;
	private Long mobileNo;
	private String pwd;

	public String getFullName() {
		return fullName;
	}

	// getters and setters methods
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
