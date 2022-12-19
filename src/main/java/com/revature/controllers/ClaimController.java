package com.revature.controllers;

import java.util.List;

import com.revature.models.PolicyClaim;
import com.revature.services.ClaimsService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class ClaimController implements Controller{
	private ClaimsService claimsService = new ClaimsService();
	
	//don't add sessions just yet because jwt
	private Handler getClaims = (ctx) -> {
		List<PolicyClaim> list = claimsService.getClaims();
		ctx.json(list);
		ctx.status(200);
	};
	
	private Handler addClaim = (ctx) -> {
		PolicyClaim newClaim = ctx.bodyAsClass(PolicyClaim.class);
		claimsService.addClaim(newClaim);
		ctx.status(201);
	};
	
	
	private Handler updateClaim =(ctx)->{
		String newStatus = ctx.body();
		claimsService.updateClaim(newStatus, 2);//two should be changed by the login feature stuff
		ctx.status(200);
	};
	
	private Handler getMyClaims =(ctx)->{
		List<PolicyClaim> list = claimsService.getClaimsByUser(2);//two should be changed by the login feature stuff
		ctx.json(list);
		ctx.status(200);
	};
	
	
	@Override
	public void addRoutes(Javalin app) {
		// TODO Auto-generated method stub
		app.get("/claims", getClaims);
		app.post("/claims", addClaim);
		app.post("/update", updateClaim);
		app.get("/myclaims", getMyClaims);
		
	}

	
	
}
