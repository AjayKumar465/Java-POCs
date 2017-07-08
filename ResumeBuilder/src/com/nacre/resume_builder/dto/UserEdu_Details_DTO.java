package com.nacre.resume_builder.dto;

import java.io.Serializable;
import java.sql.Date;

public class UserEdu_Details_DTO implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	// education properties of user
	
	private String education_level;
	private String clg_or_school_name;
	private String board_of_edu;
	private Date dop;
	private float percentage;
	private Integer userid;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getEducation_level() {
		return education_level;
	}

	public void setEducation_level(String education_level) {
		this.education_level = education_level;
	}

	public String getClg_or_school_name() {
		return clg_or_school_name;
	}

	public void setClg_or_school_name(String clg_or_school_name) {
		this.clg_or_school_name = clg_or_school_name;
	}

	public String getBoard_of_edu() {
		return board_of_edu;
	}

	public void setBoard_of_edu(String board_of_edu) {
		this.board_of_edu = board_of_edu;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
