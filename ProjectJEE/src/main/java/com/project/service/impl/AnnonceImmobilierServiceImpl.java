package com.project.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.AnnonceImmobilier;
import com.project.dao.AnnonceImmobilierDao;
import com.project.service.facade.AnnonceImmobilierService;

@Service
public class AnnonceImmobilierServiceImpl  implements AnnonceImmobilierService{
	
	@Autowired
	private AnnonceImmobilierDao annonceImmobilierDao;


	@Override
	public int save(AnnonceImmobilier annonceImmobilier) {
		AnnonceImmobilier findAnnonceImmobilier = findByReference(annonceImmobilier.getReference());
		if(findAnnonceImmobilier!=null) {
			return -1;
		}else{
			annonceImmobilier.setDateAnnonce(new Date());
			annonceImmobilierDao.save(annonceImmobilier);
			return 1;
		}
	}

	@Override
	public List<AnnonceImmobilier> findAll() {
		return annonceImmobilierDao.findAll() ;
	}

	@Override
	public AnnonceImmobilier findByReference(String reference) {
		return annonceImmobilierDao.findByReference(reference) ;
	}

	@Override
	public int update(AnnonceImmobilier annonceImmobilier) {
		AnnonceImmobilier findAnnonceImmobilier = findByReference(annonceImmobilier.getReference());
		if(findAnnonceImmobilier==null) {
			return -1;
	}else {
		findAnnonceImmobilier.setPrix(annonceImmobilier.getPrix());
		findAnnonceImmobilier.setSurface(annonceImmobilier.getSurface());
		findAnnonceImmobilier.setAdresseImm(annonceImmobilier.getAdresseImm());
		findAnnonceImmobilier.setTitreAnnonce(annonceImmobilier.getTitreAnnonce());
		findAnnonceImmobilier.setVilleImm(annonceImmobilier.getVilleImm());
		findAnnonceImmobilier.setDateAnnonce(new Date());
		return 1;
	}	
}

	@Override
	public AnnonceImmobilier deleteByReference(String reference) {
		return annonceImmobilierDao.deleteByReference(reference);
	}

	@Override
	public AnnonceImmobilier findByPrix(String prix) {
		return annonceImmobilierDao.findByPrix(prix);
	}

	@Override
	public AnnonceImmobilier findByTitreAnnonce(String titreAnnonce) {
		return annonceImmobilierDao.findByTitreAnnonce(titreAnnonce);
	}

	@Override
	public AnnonceImmobilier findByVilleImm(String villeImm) {
		return annonceImmobilierDao.findByVilleImm(villeImm);
	}
}
