package com.dao;

import java.util.List;

import com.model.User;

public interface UserDAO
{
	void registration(User user);
	List<User> getAllUser();
	User login(User user);
	User updateUser(User validUser);
	User getUserByUsername(int id);
	
}