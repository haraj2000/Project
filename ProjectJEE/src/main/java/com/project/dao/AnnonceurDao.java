package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Annonceur;


@Repository
public interface AnnonceurDao extends JpaRepository<Annonceur, Long> {
	
	public Annonceur findByLogin(String login);
	public List<Annonceur> findByLastName(String lastName);
	public Annonceur findByMail(String mail);
	
}
