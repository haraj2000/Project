package com.project.service.façade;

import java.util.List;

import com.project.bean.AnnonceImmobilier;

public interface AnnonceImmobilierService {

	public AnnonceImmobilier findByReference(String reference);
	public int save(AnnonceImmobilier annonceImmobilier);
	public List<AnnonceImmobilier> findAll();
	public int update(AnnonceImmobilier annonceImmobilier);
	public AnnonceImmobilier deleteByReference(String reference);
	public AnnonceImmobilier findByPrix(String prix);
	public AnnonceImmobilier findByTitreAnnonce(String titreAnnonce);
	public AnnonceImmobilier findByVilleImm(String villeImm);
}
