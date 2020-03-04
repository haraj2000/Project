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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marque findByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marque findByAnnee(int annee) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	
}
