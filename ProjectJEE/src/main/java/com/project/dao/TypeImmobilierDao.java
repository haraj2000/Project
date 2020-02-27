package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.TypeImmobilier;

@Repository
public interface TypeImmobilierDao extends JpaRepository<TypeImmobilier, Long> {
	

}
