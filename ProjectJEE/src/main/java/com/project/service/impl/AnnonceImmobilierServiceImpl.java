package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.bean.AnnonceImmobilier;
import com.project.dao.AnnonceimobilierDao;
import com.project.service.façade.AnnonceImmobilierService;

public class AnnonceImmobilierServiceImpl  implements AnnonceImmobilierService{
	
	@Autowired
	private AnnonceimobilierDao annonceImmobilierDao;

	@Override
	public AnnonceImmobilier findById(int id) {
		return annonceImmobilierDao.findById(id) ;
	}

	@Override
	public void save(AnnonceImmobilier annonceImmobilier) {
		annonceImmobilierDao.save(annonceImmobilier);
	}

	@Override
	public List<AnnonceImmobilier> findAll() {
		return annonceImmobilierDao.findAll() ;
	}
	

}
