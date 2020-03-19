package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.User;
import com.project.service.facade.UserService;

@RestController
@RequestMapping("project/User")
public class UserRest {

	@Autowired
	private UserService userService;

	public int save(User user) {
		return userService.save(user);
	}

	public List<User> findAll() {
		return userService.findAll();
	}

	public int update(User user) {
		return userService.update(user);
	}

	public List<User> findByLogin(String login) {
		return userService.findByLogin(login);
	}
}
