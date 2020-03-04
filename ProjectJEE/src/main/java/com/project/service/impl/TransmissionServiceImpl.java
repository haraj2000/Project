package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Transmission;
import com.project.dao.AnnonceVoitureDao;
import com.project.dao.TransmissionDao;
import com.project.service.façade.TransmissionService;

@Service
public class TransmissionServiceImpl implements TransmissionService{
	@Autowired
	private TransmissionDao transmissionDao;

	@Override
	public Transmission findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transmission> findByAnnonceVoitureReferance(String referance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transmission> findByAnnonceVoitureReferanceAndLibelle(String referance, String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Transmission transmission) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Transmission> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transmission deleteByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

}
