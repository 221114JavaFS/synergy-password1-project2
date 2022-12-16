package com.revature.services;

import com.revature.daos.UserDAO;
import com.revature.daos.UserDAOImpl;
import com.revature.models.User;

public class UserService {

	private UserDAO userDao = new UserDAOImpl();
	
	
	public User logIn(User user) {
		return userDao.login(user);
	}
	
	public boolean newAccount(User user) {
		return userDao.createAccount(user);
	}
}
