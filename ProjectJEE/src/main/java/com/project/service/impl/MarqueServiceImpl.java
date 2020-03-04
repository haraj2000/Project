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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Marque> findByModeleVersion(String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Marque marque) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int restituer(String nom) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Marque> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
