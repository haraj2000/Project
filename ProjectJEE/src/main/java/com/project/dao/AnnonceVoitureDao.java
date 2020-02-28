package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.AnnonceVoiture;

@Repository
public interface AnnonceVoitureDao extends JpaRepository<AnnonceVoiture, Long> {
	public AnnonceVoiture findByReferance(String referance);

	public List<AnnonceVoiture> findByMarqueNom(String nom);

}
