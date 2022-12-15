package com.revature.models;

public class User {
	private String user_id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String dateOfBirth;
	private String socialSecurityNumber;
	private String address;
	private boolean currentEmployee;
	private boolean currentSubscriber;
	


	//constructor for creating a new user
	public User(String firstName, String lastName, String email, String password, String dateOfBirth,
			String socialSecurityNumber, String address, boolean currentEmployee, boolean currentSubscriber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address = address;
		this.currentEmployee = currentEmployee;
		this.currentSubscriber = currentSubscriber;
	}
	
	

	//constructor for logging in part 1
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	
	//constructor for logging in part 2
	public User(String user_id, String firstName, String lastName, String email, String password, String dateOfBirth,
			String socialSecurityNumber, String address, boolean currentEmployee, boolean currentSubscriber) {
		super();
		this.user_id = user_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address = address;
		this.currentEmployee = currentEmployee;
		this.currentSubscriber = currentSubscriber;
	}



	public User() {
		super();
	}
	
	
	
	

	public String getUser_id() {
		return user_id;
	}



	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isCurrentEmployee() {
		return currentEmployee;
	}

	public void setCurrentEmployee(boolean currentEmployee) {
		this.currentEmployee = currentEmployee;
	}

	public boolean isCurrentSubscriber() {
		return currentSubscriber;
	}

	public void setCurrentSubscriber(boolean currentSubscriber) {
		this.currentSubscriber = currentSubscriber;
	}



	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", socialSecurityNumber="
				+ socialSecurityNumber + ", address=" + address + ", currentEmployee=" + currentEmployee
				+ ", currentSubscriber=" + currentSubscriber + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (currentEmployee ? 1231 : 1237);
		result = prime * result + (currentSubscriber ? 1231 : 1237);
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((socialSecurityNumber == null) ? 0 : socialSecurityNumber.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (currentEmployee != other.currentEmployee)
			return false;
		if (currentSubscriber != other.currentSubscriber)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (socialSecurityNumber == null) {
			if (other.socialSecurityNumber != null)
				return false;
		} else if (!socialSecurityNumber.equals(other.socialSecurityNumber))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
