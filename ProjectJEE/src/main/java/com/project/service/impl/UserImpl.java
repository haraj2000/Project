package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.User;
import com.project.dao.UserDao;
import com.project.service.facade.UserService;


@Service
public class UserImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public int save(User user) {
		List<User> userFounded = findByLogin(user.getLogin());
		if( userFounded != null)
			return -1;
		else if (user.getPassword()==null)
			return -2;
		else {
			userDao.save(user);
		return 1;
		}
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public int update(User user) {
		return 0;
	}


	@Override
	public List<User> findByLogin(String login) {
		return userDao.findByLogin(login);
	}
	
}
