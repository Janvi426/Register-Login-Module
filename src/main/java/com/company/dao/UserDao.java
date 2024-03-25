package com.company.dao;

public interface UserDao {

	boolean addUser(User user);
	boolean isValidUser(String username, String password);
	boolean changePassword(String username, String newPassword);
}
