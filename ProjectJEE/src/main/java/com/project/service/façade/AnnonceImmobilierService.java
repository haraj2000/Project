package com.project.service.façade;

import java.util.List;

import com.project.bean.AnnonceImmobilier;

public interface AnnonceImmobilierService {

	public AnnonceImmobilier findById(int id);

	public void save(AnnonceImmobilier annonceImmobilier);

	public List<AnnonceImmobilier> findAll();

}
