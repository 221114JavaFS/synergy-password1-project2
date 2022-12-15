package com.revature.models;

import java.sql.Date;

public class PolicyClaim {
	private int claim_id;
	private int user_id;
	private String description;
	private double amount;
	private String status="pending";
	private Date submission_date;
	private Date decision_date=null;
	public PolicyClaim() {
		
	}
	
	
	
	public PolicyClaim(String description, int user_id, double amount) {
		super();
		//claim id should be generated and set
		this.description = description;
		this.user_id = user_id;
		this.amount = amount;
		this.submission_date =  new Date(System.currentTimeMillis()); 
		//decision date will get set when decision status is changed.
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getUser() {
		return user_id;
	}
	
	public void setUser(int user_id) {
		this.user_id = user_id;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public int getClaim_id() {
		return claim_id;
	}

	public void setClaim_id(int claim_id) {
		this.claim_id = claim_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Date getSubmission_date() {
		return submission_date;
	}

	public void setSubmission_date(Date submission_date) {
		this.submission_date = submission_date;
	}

	public Date getDecision_date() {
		return decision_date;
	}

	public void setDecision_date(Date decision_date) {
		this.decision_date = decision_date;
	}
	

//	public static void main(String[] args) {
//		PolicyClaim claim=new PolicyClaim("test",123456,30.00 );
//		System.out.println(claim);
//	}
	

}
