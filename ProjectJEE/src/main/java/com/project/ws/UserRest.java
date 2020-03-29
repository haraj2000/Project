package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.User;
import com.project.service.facade.UserService;

@RestController
@RequestMapping("project/User")
public class UserRest {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public int save(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("/")
	public List<User> findAll() {
		return userService.findAll();
	}

	@PutMapping("/")
	public int update(@RequestBody User user) {
		return userService.update(user);
	}

	@GetMapping("/login/{login}")
	public List<User> findByLogin(@PathVariable String login) {
		return userService.findByLogin(login);
	}
}
