package com.project.service.facade;

import java.util.List;

import com.project.bean.User;

public interface UserService {

	public int save(User user);
	public List<User> findAll();
	public int update(User user);	
	public List<User> findByLogin(String login);}
