package com.nacre.resume_builder.dao;

import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public interface Get_country_state_city_DAO {
	//for getting countries and stats and city
public String getCountriesArray()throws ResumeBuilderDBExceptions;
public String getStates(String cname)throws ResumeBuilderDBExceptions;
public String getCity(String cname)throws ResumeBuilderDBExceptions;

}
