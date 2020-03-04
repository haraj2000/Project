package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;
import com.project.dao.TypeAnnonceurDao;
import com.project.service.façade.TypeAnnonceurService;

@Service
public class TypeAnnonceurImpl implements TypeAnnonceurService {

	@Autowired
	TypeAnnonceurDao typeAnnonceurDao;
	
	@Override
	public int save(TypeAnnonceur typeAnnonceur) {
		TypeAnnonceur typeAnnonceurFounded = findByLibelle(typeAnnonceur.getLibelle());
		if( typeAnnonceurFounded != null)
			return -1;
		else {
			typeAnnonceurDao.save(typeAnnonceur);
		return 1;
		}		
	}

	@Override
	public List<TypeAnnonceur> findAll() {
		return typeAnnonceurDao.findAll();
	}

	@Override
	public TypeAnnonceur findByAnnonceur(Annonceur annonceur) {
		return typeAnnonceurDao.findByAnnonceur(annonceur);
	}

	@Override
	public TypeAnnonceur findByLibelle(String libelle) {
		return typeAnnonceurDao.findByLibelle(libelle);
	}

}
