package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.CovidInfo;
import com.revature.utils.ConnectionUtil;

public class CovidInfoDAOImpl implements CovidInfoDAO {

	// get all the covid infos for a user by his ID
	@Override
	public List<CovidInfo> getUserCovidInfoById(int id) {
		try (Connection connection = ConnectionUtil.getConnection()) {		
			String sql = "SELECT covid_id, user_id, vaccine_type, vaccination_date FROM projecttwo.covid_info JOIN projecttwo.user_info USING (user_id) WHERE user_id = " +id+";";
			
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(sql);
			
			
			List<CovidInfo> covidInfos = new ArrayList<>();
			
			if(resultSet.next()) {
				CovidInfo covidInfo = new CovidInfo();
				
				covidInfo.setCovidId(resultSet.getInt("covid_id"));
				covidInfo.setUser_id(resultSet.getInt("user_id"));
				covidInfo.setVaccine_type(resultSet.getString("vaccine_type"));
				covidInfo.setVaccine_type(resultSet.getString("vaccination_date"));	
				
				covidInfos.add(covidInfo);
			}
			return covidInfos;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public boolean addCovidInfo(CovidInfo covidinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCovidInfo(CovidInfo covidinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCovidInfoById(int covid_id) {
		// TODO Auto-generated method stub
		return false;
	}
	
//	public static void main(String[] args) {
//	CovidInfoDAO dao = new CovidInfoDAOImpl();
//	System.out.println("Testing CovidInfoDAOImpl");
//	System.out.println(dao.getUserCovidInfoById(2));
//	System.out.println((dao.getUserCovidInfoById(1)).get(0).getVaccine_type()); // works but feels like this should be different
//	System.out.println(dao.getUserCovidInfoById(2));

//}

}
