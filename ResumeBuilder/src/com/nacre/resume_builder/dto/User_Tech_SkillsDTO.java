package com.nacre.resume_builder.dto;

import java.io.Serializable;

public class User_Tech_SkillsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String techSkill;
	private Integer userid;
	public String getTechSkill() {
		return techSkill;
	}

	public void setTechSkill(String techSkill) {
		this.techSkill = techSkill;
	}

	

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}
