package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Annonceur;
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

}
