package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.AnnonceImmobilier;

@Repository
public interface AnnonceimobilierDao extends JpaRepository<AnnonceImmobilier, Long> {
	public AnnonceImmobilier findById(int id);
}
