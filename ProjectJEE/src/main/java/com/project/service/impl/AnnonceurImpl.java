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
		Annonceur annonceurFounded = findByLogin(annonceur.getLogin());
		if( annonceurFounded != null)
			return -1;
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
	public Annonceur findByLogin(String login) {
		return annonceurDao.findByLogin(login);
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
	public int deleteByLogin(String login) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(String login, String firstName, String lastName, int numberPhone, String country, String city,
			String address) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Annonceur> findByFisrtName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonceur> findByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonceur> findByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonceur> findByTypeAnnonceur(TypeAnnonceur typeAnnonceur) {
		// TODO Auto-generated method stub
		return null;
	}

}
