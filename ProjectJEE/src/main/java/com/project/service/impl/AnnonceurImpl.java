package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;
import com.project.dao.AnnonceurDao;
import com.project.service.façade.AnnonceurService;

@Service
public class AnnonceurImpl implements AnnonceurService {

	@Autowired
	AnnonceurDao annonceurDao;
	
	@Override
	public int save(Annonceur annonceur) {
		Annonceur annonceurFounded = findByMail(annonceur.getMail());
		if( annonceurFounded != null)
			return -1;
		else if (annonceur.getPassword()==null)
			return -2;
		else {
			annonceurDao.save(annonceur);
		return 1;
		}
	}

	@Override
	public List<Annonceur> findAll() {
		return annonceurDao.findAll();
	}

	@Override
	public List<Annonceur> findByLastName(String lastName) {
		return annonceurDao.findByLastName(lastName);
	}

	@Override
	public Annonceur findByMail(String mail) {
		return annonceurDao.findByMail(mail);
	}

	@Override
	public int deleteByMail(String mail) {
		return annonceurDao.deleteByMail(mail);
	}

	@Override
	public int update(String mail, String firstName, String lastName, int phoneNumber, String country, String city,
			String address) {
		Annonceur annonceurFounded = findByMail(mail);
		if( annonceurFounded != null)
			return -1;
		else {
			annonceurFounded.setFirstName(firstName);
			annonceurFounded.setLastName(lastName);
			annonceurFounded.setPhoneNumber(phoneNumber);
			annonceurFounded.setCountry(country);
			annonceurFounded.setCity(city);
			annonceurFounded.setAddress(address);
			annonceurDao.save(annonceurFounded);
		}
		return 0;
	}

	@Override
	public List<Annonceur> findByFisrtName(String firstName) {
		return annonceurDao.findByFisrtName(firstName);
	}

	@Override
	public List<Annonceur> findByCountry(String country) {
		return annonceurDao.findByCountry(country);
	}

	@Override
	public List<Annonceur> findByCity(String city) {
		return annonceurDao.findByCity(city);
	}

	@Override
	public List<Annonceur> findByTypeAnnonceur(TypeAnnonceur typeAnnonceur) {
		return annonceurDao.findByTypeAnnonceur(typeAnnonceur);
	}

}
