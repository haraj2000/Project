package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.TypeAnnonce;

@Repository
public interface TypeAnnonceDao extends JpaRepository<TypeAnnonce, Long> {
	

}
