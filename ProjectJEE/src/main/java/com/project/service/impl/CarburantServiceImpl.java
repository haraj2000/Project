package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.bean.Carburant;
import com.project.dao.CarburantDao;
import com.project.service.facade.CarburantService;

@Service
public class CarburantServiceImpl implements CarburantService {
	@Autowired
	private CarburantDao carburantDao;

	@Override
	public Carburant findByLibelle(String libelle) {
		return carburantDao.findByLibelle(libelle);
	}

	@Override
	public Carburant findByEnergie(String energie) {
	 return carburantDao.findByEnergie(energie);
	}

	@Override
	public List<Carburant> findByAnnonceVoitureReference(String reference) {
		 return carburantDao.findByAnnonceVoitureReference(reference);
	}

	@Override
	public List<Carburant> findByAnnonceVoitureReferenceAndLibelle(String reference, String libelle) {
		return carburantDao.findByAnnonceVoitureReferenceAndLibelle(reference,libelle);
	}

	@Override
	public int save(Carburant carburant) {
		Carburant foundedCarburant = findByLibelle(carburant.getLibelle());

		if (foundedCarburant != null) {
			return -1;
		} else {
			carburantDao.save(carburant);
			return 1;
		}
		
	}

	@Override
	public List<Carburant> findAll() {
		return carburantDao.findAll();
	}

	@Override
	public Carburant deleteByLibelle(String libelle) {
		return carburantDao.deleteByLibelle(libelle);
		}

}
