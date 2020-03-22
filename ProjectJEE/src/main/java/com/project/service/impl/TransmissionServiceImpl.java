package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Transmission;
import com.project.dao.TransmissionDao;
import com.project.service.facade.TransmissionService;

@Service
public class TransmissionServiceImpl implements TransmissionService{
	@Autowired
	private TransmissionDao transmissionDao;

	@Override
	public Transmission findByLibelle(String libelle) {
		return transmissionDao.findByLibelle(libelle);
		}

	@Override
	public List<Transmission> findByAnnonceVoitureReference(String reference) {
		return transmissionDao.findByAnnonceVoitureReference(reference);
	}


	@Override
	public List<Transmission> findByAnnonceVoitureReferenceAndLibelle(String reference, String libelle) {
		return transmissionDao.findByAnnonceVoitureReferenceAndLibelle(reference,libelle);
	}
	
	@Override
	public int save(Transmission transmission) {
		Transmission foundedTransmission = findByLibelle(transmission.getLibelle());

		if (foundedTransmission != null) {
			return -1;
		} else {
			transmissionDao.save(transmission);
			return 1;
		}
		
	}

	@Override
	public List<Transmission> findAll() {
		return transmissionDao.findAll();
	}

	@Override
	public Transmission deleteByLibelle(String libelle) {
		return transmissionDao.deleteByLibelle(libelle);
	}


	

}
