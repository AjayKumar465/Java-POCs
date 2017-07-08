package com.nacre.resume_builder.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.nacre.resume_builder.dao.Get_country_state_city_DAO;
import com.nacre.resume_builder.dbutil.DbUtil;
import com.nacre.resume_builder.exception.ResumeBuilderDBExceptions;

public class Get_country_state_city_DAOImpl implements Get_country_state_city_DAO {

	private static final String GET_ALL_COUNTRIES = "SELECT COUNTRYNAME FROM COUNTRY";

	private static final String GET_ALL_STATES = "SELECT S.STATENAME FROM STATE S JOIN COUNTRY C ON S.COUNTRYID = C.COUNTRYID WHERE COUNTRYNAME=?";
	private static final String GET_ALL_CITIES = "SELECT C.CITYNAME FROM CITY C JOIN STATE S ON S.STATEID = C.STATEID WHERE STATENAME=?";

	@Override
	public String getStates(String cname) throws ResumeBuilderDBExceptions {
		ArrayList<String> list = new ArrayList<>();
		
		Connection con = null;
		ResultSet rs = null;
		Statement st = null;

		try {
			con = DbUtil.getConnection();
			PreparedStatement pst = con.prepareStatement(GET_ALL_STATES);
			pst.setString(1, cname);
			rs = pst.executeQuery();
			list.add("select");
			while (rs.next()) {
				/*
				 * jsonObj = new JSONObject(); jsonObj.put("name",
				 * rs.getString(1));
				 */
				list.add(rs.getString(1));
				// jsonArr.put(jsonObj);

			}
			
			if(list.size()==1){
				list.remove(0);
				list.add("No entries");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Gson().toJson(list);
	}

	@Override
	public String getCity(String cname) throws ResumeBuilderDBExceptions {
		ArrayList<String> list = new ArrayList<>();
		
		Connection con = null;
		ResultSet rs = null;
		Statement st = null;

		try {
			con = DbUtil.getConnection();
			PreparedStatement pst = con.prepareStatement(GET_ALL_CITIES);
			pst.setString(1, cname);
			rs = pst.executeQuery();
			list.add("select");
			while (rs.next()) {
				/*
				 * jsonObj = new JSONObject(); jsonObj.put("name",
				 * rs.getString(1));
				 */
				list.add(rs.getString(1));
				// jsonArr.put(jsonObj);

			}
			if(list.size()==1){
				list.remove(0);
				list.add("No entries");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Gson().toJson(list);
	}

	@Override
	public String getCountriesArray() throws ResumeBuilderDBExceptions {
		ArrayList<String> list = new ArrayList<>();

		Connection con = null;
		ResultSet rs = null;
		Statement st = null;
		try {

			con = DbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(GET_ALL_COUNTRIES);
			list.add("select");
			while (rs.next()) {
				/*
				 * jsonObj = new JSONObject(); jsonObj.put("name",
				 * rs.getString(1));
				 */
				list.add(rs.getString(1));
				// jsonArr.put(jsonObj);

			}

		} catch (SQLException e) {
			throw new ResumeBuilderDBExceptions("Exception in country class and related to DB");
		}
		System.out.println(list + " list");
		return new Gson().toJson(list);

	}

	
}
