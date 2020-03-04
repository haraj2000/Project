package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.AnnonceImmobilier;

@Repository
public interface AnnonceImmobilierDao extends JpaRepository<AnnonceImmobilier, Long> {
	public AnnonceImmobilier findByReference(String reference);
	public AnnonceImmobilier deleteByReference(String reference);
	public AnnonceImmobilier findByPrix(String prix);
	public AnnonceImmobilier findByTitreAnnonce(String titreAnnonce);
	public AnnonceImmobilier findByVilleImm(String villeImm);
	
}
