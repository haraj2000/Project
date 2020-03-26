package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Marque;

@Repository
public interface MarqueDao extends JpaRepository<Marque, Long> {
	
	public Marque findByNom(String nom);
	public Marque deleteByNom(String nom);


	public List<Marque> findByModeleVersion(String version);
	
	

	
	
}
