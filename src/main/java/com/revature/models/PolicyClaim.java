package com.revature.models;

public class PolicyClaim {
	private int claim_id;
	private int user_id;
	private String description;
	private double amount;
	private String status="pending";
	
	//there might be more variables but these work for now. 
	public PolicyClaim() {
		
	}
	
	
	
	public PolicyClaim(String description, int user_id, double amount) {
		super();
		this.description = description;
		this.user_id = user_id;
		this.amount = amount;
	}



	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
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
	
	

}
