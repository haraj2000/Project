package com.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;
import com.project.service.façade.TypeAnnonceurService;

@Service
public class TypeAnnonceurImpl implements TypeAnnonceurService {

	@Override
	public void save(TypeAnnonceur typeAnnonceur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TypeAnnonceur> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeAnnonceur findByAnnonceur(Annonceur annonceur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeAnnonceur findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

}
