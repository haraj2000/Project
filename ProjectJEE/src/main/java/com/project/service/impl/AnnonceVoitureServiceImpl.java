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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AnnonceVoiture> findByMarqueNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AnnonceVoiture> findPrix(BigDecimal prix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AnnonceVoiture> findByKilometrage(Long kilometrage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AnnonceVoiture> findByCouleur(String couleur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(AnnonceVoiture annonceVoiture) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int restituer(String reference) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AnnonceVoiture> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
