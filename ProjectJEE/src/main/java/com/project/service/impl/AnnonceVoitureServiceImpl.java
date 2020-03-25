package com.project.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.AnnonceVoiture;
import com.project.dao.AnnonceVoitureDao;
import com.project.service.facade.AnnonceVoitureService;

@Service

public class AnnonceVoitureServiceImpl implements AnnonceVoitureService {
	@Autowired
	private AnnonceVoitureDao annonceVoitureDao;

	@Override
	public AnnonceVoiture findByReference(String reference) {
		return annonceVoitureDao.findByReference(reference);
	}

	@Override
	public List<AnnonceVoiture> findByMarqueNom(String nom) {
		return annonceVoitureDao.findByMarqueNom(nom);
	}

	@Override
	public List<AnnonceVoiture> findByPrix(BigDecimal prix) {
		return annonceVoitureDao.findByPrix(prix);
	}

	@Override
	public List<AnnonceVoiture> findByKilometrage(Long kilometrage) {
		return annonceVoitureDao.findByKilometrage(kilometrage);
	}

	@Override
	public List<AnnonceVoiture> findByCouleur(String couleur) {
		return annonceVoitureDao.findByCouleur(couleur);
	}

	@Override
	public int save(AnnonceVoiture annonceVoiture) {
		AnnonceVoiture foundedAnnonceVoiture = findByReference(annonceVoiture.getReference());

		if (foundedAnnonceVoiture != null) {
			return -1;
		} else {
			annonceVoiture.setDate(new Date());
			annonceVoitureDao.save(annonceVoiture);
			return 1;
		}
	}

	@Override
	public List<AnnonceVoiture> findAll() {
		return annonceVoitureDao.findAll();
	}

	@Override
	public int restituer(String reference, BigDecimal prix) {
		AnnonceVoiture foundedAnnonceVoiture = findByReference(reference);
		if (foundedAnnonceVoiture == null)
			return -1;
		else if (foundedAnnonceVoiture.getPrix() != null)
			return -2;
		else {
			foundedAnnonceVoiture.setPrix(prix);
			annonceVoitureDao.save(foundedAnnonceVoiture);
			return 1;
		}	}
}

