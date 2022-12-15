package com.revature.services;

import java.util.List;

import com.revature.daos.ClaimDAOImpl;
import com.revature.models.PolicyClaim;



public class ClaimsService {
	private ClaimDAOImpl claimDAO = new ClaimDAOImpl();
	
	public List<PolicyClaim> getClaims(){
		return claimDAO.getClaims();
	}
	
	public void addClaim(PolicyClaim newClaim) {
		claimDAO.addClaim(newClaim);

	}

}
