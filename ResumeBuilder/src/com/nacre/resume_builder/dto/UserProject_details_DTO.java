package com.nacre.resume_builder.dto;

import java.io.Serializable;

public class UserProject_details_DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 600011076256283876L;
	private String projectTitle;
	private String domain;
	private Integer teamSize;
	private String role;
	private String description;
	
	private Integer userid;
	
	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

}
