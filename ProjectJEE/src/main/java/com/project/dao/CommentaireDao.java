package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Commentaire;

@Repository
public interface CommentaireDao extends JpaRepository<Commentaire, Long> {
	

}