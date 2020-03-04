package com.project.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.AnnonceVoiture;
import com.project.dao.AnnonceVoitureDao;
import com.project.service.façade.AnnonceVoitureService;

@Service

public class AnnonceVoitureServiceImpl implements AnnonceVoitureService {
	@Autowired
	private AnnonceVoitureDao annonceVoitureDao;

	@Override
	public AnnonceVoiture findByReferance(String referance) {
		return annonceVoitureDao.findByReferance(referance);
	}

	@Override
	public List<AnnonceVoiture> findByMarqueNom(String nom) {
		return annonceVoitureDao.findByMarqueNom(nom);
	}

	@Override
	public List<AnnonceVoiture> findPrix(BigDecimal prix) {
		return annonceVoitureDao.findPrix(prix);
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
		AnnonceVoiture foundedAnnonceVoiture = findByReferance(annonceVoiture.getReferance());

		if (foundedAnnonceVoiture != null) {
			return -1;
		} else {
			annonceVoitureDao.save(annonceVoiture);
			return 1;
		}
	}

	@Override
	public int restituer(String reference) {
		return 0;
	}

	@Override
	public List<AnnonceVoiture> findAll() {
		return annonceVoitureDao.findAll();
	}

}
