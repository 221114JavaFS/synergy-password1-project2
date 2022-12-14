package com.revature.models;

public class PolicyClaim {

	private String description;
	private String user;
	private double amount;
	private String status="pending";
	//there might be more variables but these work for now. 
	public PolicyClaim() {
		
	}
	
	
	
	public PolicyClaim(String description, String user, double amount) {
		super();
		this.description = description;
		this.user = user;
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
