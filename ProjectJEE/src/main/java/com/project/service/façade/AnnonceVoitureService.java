package com.project.service.façade;

import java.math.BigDecimal;
import java.util.List;

import com.project.bean.AnnonceVoiture;


public interface AnnonceVoitureService {
	
	public AnnonceVoiture findByReferance(String referance);

	public List<AnnonceVoiture> findByMarqueNom(String nom);
	
	public List<AnnonceVoiture> findPrix(BigDecimal prix);
	
	public List<AnnonceVoiture> findByKilometrage(Long kilometrage);
	
	public List<AnnonceVoiture> findByCouleur(String couleur);
	
	public int save(AnnonceVoiture annonceVoiture);

	public int restituer(String reference);

	public List<AnnonceVoiture> findAll();
}
