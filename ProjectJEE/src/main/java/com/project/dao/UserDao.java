package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.User;


@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
	public List<User> findByLogin(String login);
	
}
