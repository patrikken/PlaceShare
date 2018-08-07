package com.u2g.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.u2g.dao.UserDao;
import com.u2g.entities.User;
import com.u2g.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userRepository; 
	 
	@Override
	public void CreateUser(User u) {
		userRepository.save(u);
	}
  
	@Override
	public User getUserByPhone(String phone) { 
		return userRepository.findUserByPhone(phone);
	}

	@Override
	public List<User> getAll() { 
		return userRepository.findAll();
	}

}
