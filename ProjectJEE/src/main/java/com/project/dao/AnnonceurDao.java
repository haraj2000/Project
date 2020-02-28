package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Annonceur;


@Repository
public interface AnnonceurDao extends JpaRepository<Annonceur, Long> {
	

}
