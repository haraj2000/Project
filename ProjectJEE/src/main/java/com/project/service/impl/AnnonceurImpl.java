package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;
import com.project.dao.AnnonceurDao;
import com.project.service.facade.AnnonceurService;

@Service
public class AnnonceurImpl implements AnnonceurService {

	@Autowired
	AnnonceurDao annonceurDao;
	
	@Override
	public int save(Annonceur annonceur) {
		String mailFounded = annonceur.getMail();
		if (mailFounded == null)
			return -1;
		else {
		Annonceur annonceurFounded = findByMail(mailFounded);
		if( annonceurFounded != null)
			return -2;
		else if (annonceur.getPassword()==null)
			return -3;
		else {
			annonceurDao.save(annonceur);
		return 1;
		}
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
	public int update(Annonceur annonceur) {
		Annonceur annonceurFounded = findByMail(annonceur.getMail());
		if( annonceurFounded == null)
			return -1;
		else {
			annonceurFounded.setFirstName(annonceur.getFirstName());
			annonceurFounded.setLastName(annonceur.getLastName());
			annonceurFounded.setPhoneNumber(annonceur.getPhoneNumber());
			annonceurFounded.setCity(annonceur.getCity());
			annonceurFounded.setAddress(annonceur.getAddress());
			annonceurFounded.setTypeAnnonceur(annonceur.getTypeAnnonceur());
			annonceurDao.save(annonceurFounded);
			return 1;
		}
	}

	@Override
	public List<Annonceur> findByFirstName(String firstName) {
		return annonceurDao.findByFirstName(firstName);
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
