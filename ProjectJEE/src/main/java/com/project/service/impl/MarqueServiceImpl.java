package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Marque;
import com.project.dao.MarqueDao;
import com.project.service.façade.MarqueService;


@Service

public class MarqueServiceImpl implements MarqueService {
	@Autowired
	private MarqueDao marqueDao;

	@Override
	public Marque findByNom(String nom) {
		return marqueDao.findByNom(nom);
	}

	@Override
	public List<Marque> findByModeleVersion(String version) {
		return marqueDao.findByModeleVersion(version);
	}

	@Override
	public int save(Marque marque) {
		return 0;
	}

	@Override
	public int restituer(String nom) {
		return 0;
	}

	@Override
	public List<Marque> findAll() {
		return marqueDao.findAll();
	}

	

}
