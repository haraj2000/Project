package com.project.service.facade;

import java.math.BigDecimal;
import java.util.List;

import com.project.bean.AnnonceVoiture;


public interface AnnonceVoitureService {
	
	public AnnonceVoiture findByReference(String reference);

	public List<AnnonceVoiture> findByMarqueNom(String nom);
	
	public List<AnnonceVoiture> findByPrix(BigDecimal prix);
	
	public List<AnnonceVoiture> findByKilometrage(Long kilometrage);
	
	public List<AnnonceVoiture> findByCouleur(String couleur);
	
	public int save(AnnonceVoiture annonceVoiture);

	public int restituer(String reference , BigDecimal prix);

	public List<AnnonceVoiture> findAll();
}
