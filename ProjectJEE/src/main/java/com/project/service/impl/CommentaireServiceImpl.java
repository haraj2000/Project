package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Commentaire;
import com.project.dao.AnnonceVoitureDao;
import com.project.dao.CommentaireDao;
import com.project.service.façade.CommentaireService;

@Service
public class CommentaireServiceImpl implements CommentaireService{
	@Autowired
	private CommentaireDao commentaireDao;

	@Override
	public List<Commentaire> findByAnnonceVoitureReferance(String referance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commentaire> findByAnnonceImmobilierReferance(String referance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Commentaire commentaire) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commentaire deleteBytitre(String titre) {
		// TODO Auto-generated method stub
		return null;
	}

}
