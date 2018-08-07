package com.u2g.service;

import java.util.List;

import com.u2g.entities.User;

public interface UserService {
	public void CreateUser(User u);

	//public User getUserById(long id);
	
	public User getUserByPhone(String phone);
	
	public List<User> getAll();
	
	// ...
}
