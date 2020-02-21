package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Carburant;

@Repository
public interface CarburantDao extends JpaRepository<Carburant, Long> {
	

}
