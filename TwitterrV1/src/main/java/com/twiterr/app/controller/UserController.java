package com.twiterr.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.twiterr.app.model.User;
import com.twiterr.app.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userrepository;

	@RequestMapping("/getuser")
	public User fetchUser() {
		User u = new User();
		u.setName("harry");
		u = userrepository.save(u);
		return userrepository.findById(u.getId()).get();
	}
	
	@RequestMapping("/getallusers")
	public Iterable<User> getAllUsers()
	{
		return userrepository.findAll();
	}
}
