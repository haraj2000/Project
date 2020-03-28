package com.project.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Marque;
import com.project.dao.MarqueDao;
import com.project.service.facade.MarqueService;

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
		Marque foundedMarque = findByNom(marque.getNom());

		if (foundedMarque != null) {
			return -1;
		} else {
			marqueDao.save(marque);
			return 1;
		}
	}

	@Override
	public int restituer(String nom) {
		return 0;
	}

	@Override
	public List<Marque> findAll() {
		return marqueDao.findAll();
	}
    @Override
	@Transactional
	public int  deleteByNom(String nom) {
		return marqueDao.deleteByNom(nom);
	}

}
