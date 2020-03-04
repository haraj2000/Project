package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Marque;
import com.project.bean.Modele;
import com.project.dao.ModeleDao;
import com.project.service.façade.ModeleService;


@Service

public class ModeleServiceImpl implements ModeleService {
	@Autowired
	private ModeleDao modeleDao;

	@Override
	public Marque findByVersion(String version) {
		return modeleDao.findByVersion(version);
	}

	@Override
	public Marque findByNom(String nom) {
		return modeleDao.findByNom(nom);
	}

	@Override
	public Marque findByAnnee(int annee) {
		return modeleDao.findByAnnee(annee);
	}

	@Override
	public int save(Modele modele) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int restituer(String nom) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Modele> findAll() {
		return modeleDao.findAll();
	}

	
}
