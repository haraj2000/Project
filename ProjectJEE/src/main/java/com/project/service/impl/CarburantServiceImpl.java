package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.bean.Carburant;
import com.project.dao.CarburantDao;
import com.project.service.façade.CarburantService;

public class CarburantServiceImpl implements CarburantService {
	@Autowired
	private CarburantDao carburantDao;


	@Override
	public void save(Carburant carburant) {
		carburantDao.save(carburant);
	}

	@Override
	public List<Carburant> findAll() {
		return carburantDao.findAll() ;
	}

}
