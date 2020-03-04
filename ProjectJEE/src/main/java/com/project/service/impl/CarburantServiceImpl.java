package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Carburant;
import com.project.dao.CarburantDao;
import com.project.service.façade.CarburantService;

@Service
public class CarburantServiceImpl implements CarburantService {
	@Autowired
	private CarburantDao carburantDao;

	@Override
	public Carburant findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carburant findByEnergie(String energie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carburant> findByAnnonceVoitureReferance(String referance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carburant> findByAnnonceVoitureReferanceAndLibelle(String referance, String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Carburant carburant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Carburant> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carburant deleteByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

}
