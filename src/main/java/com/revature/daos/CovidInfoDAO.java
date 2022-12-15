package com.revature.daos;

import java.util.List;

import com.revature.models.CovidInfo;

public interface CovidInfoDAO {
	
	// get a users covid infos using their id 
	public abstract List<CovidInfo> getUserCovidInfoById(int user_id);
	
	// I was going to add get a single covid info, but I dont think above satisifies that
	
	// add new covid info to card
	public abstract boolean addCovidInfo(CovidInfo covidinfo);
	
	// update covid card, the placehaolders value can just resend the entire update. 
	public abstract boolean updateCovidInfo(CovidInfo covidinfo);
	
	
	public abstract boolean deleteCovidInfoById(int covid_id);
	
}
