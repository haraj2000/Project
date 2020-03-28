package com.project.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.AnnonceVoiture;

@Repository
public interface AnnonceVoitureDao extends JpaRepository<AnnonceVoiture, Long> {
	
	
	public AnnonceVoiture findByReference(String reference);

	public List<AnnonceVoiture> findByMarqueNom(String nom);
	
	public List<AnnonceVoiture> findByPrix(BigDecimal prix);
	
	public List<AnnonceVoiture> findByKilometrage(Long kilometrage);
	
	public List<AnnonceVoiture> findByCouleur(String couleur);
	
	public AnnonceVoiture deleteByReference(String reference);
	
}
