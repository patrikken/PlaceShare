package com.u2g.webService;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.u2g.entities.User;
import com.u2g.service.UserService;

@RestController
public class UserController {
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public void CreateUser(@RequestBody User u) {
		userService.CreateUser(u);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getAllUser() {
		logger.debug("##############################geting users################################");
		return userService.getAll();
	}
}
