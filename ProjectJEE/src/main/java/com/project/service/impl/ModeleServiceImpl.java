package com.project.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Modele;
import com.project.dao.ModeleDao;
import com.project.service.facade.ModeleService;


@Service

public class ModeleServiceImpl implements ModeleService {
	@Autowired
	private ModeleDao modeleDao;

	@Override
	public Modele findByVersion(String version) {
		return modeleDao.findByVersion(version);
	}

	@Override
	public Modele findByNom(String nom) {
		return modeleDao.findByNom(nom);
	}

	@Override
	public Modele findByAnnee(int annee) {
		return modeleDao.findByAnnee(annee);
	}

	@Override
	public int save(Modele modele) {
		Modele foundedModele = findByVersion(modele.getVersion());

		if (foundedModele != null) {
			return -1;
		} else {
			modeleDao.save(modele);
			return 1;
		}	}

	@Override
	public int restituer(String nom) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Modele> findAll() {
		return modeleDao.findAll();
	}
@Transactional
	@Override
	public int deleteByVersion(String version) {
		return modeleDao.deleteByVersion(version);
	}

	
}
