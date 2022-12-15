package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.User;
import com.revature.util.ConnectionUtil; //Will throw an error until we have the database connection

public class UserDAOImpl implements UserDAO {

	@Override
	public boolean createAccount(User user) { //Will throw an error until we have the database connection
		try (Connection connection = ConnectionUtil.getConnection()) { //first checks if email is in database
			PreparedStatement statement = connection.prepareStatement("SELECT email FROM user_info WHERE email = ?;");
			statement.setString(1, user.getEmail());
			ResultSet result = statement.executeQuery();

			if (!result.next()) { //if email is not in the database, creates new user with info provided
				PreparedStatement statementTwo = connection.prepareStatement(
						"INSERT INTO user_info(first_name, last_name, email, password, DoB, SSN, address, current_employee, current_subscriber) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
				statementTwo.setString(1, user.getFirstName());
				statementTwo.setString(2, user.getLastName());
				statementTwo.setString(3, user.getEmail());
				statementTwo.setString(4, user.getPassword());
				statementTwo.setString(5, user.getDateOfBirth());
				statementTwo.setString(6, user.getSocialSecurityNumber());
				statementTwo.setString(7, user.getAddress());
				statementTwo.setBoolean(8, user.isCurrentEmployee());
				statementTwo.setBoolean(9, user.isCurrentSubscriber());
				int result2 = statementTwo.executeUpdate();
				return true; //returns true if user created
			}
			return false; //returns false if user not created (user already in database)

		} catch (SQLException e) {
			e.printStackTrace();
			return false; //returns false if any SQL errors
		}
	}

}
