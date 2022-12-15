package com.revature.daos;

import java.util.List;

import com.revature.models.PolicyClaim;

public interface ClaimDAO {

	public abstract List<PolicyClaim> getClaims();
	public abstract void addClaim(PolicyClaim newClaim);

}
