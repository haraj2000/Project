package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Commentaire;
import com.project.dao.CommentaireDao;
import com.project.service.façade.CommentaireService;

@Service
public class CommentaireServiceImpl implements CommentaireService{
	@Autowired
	private CommentaireDao commentaireDao;

	@Override
	public Commentaire findByTitre(String titre) {
		return commentaireDao.findByTitre(titre);
	}
	
	
	@Override
	public List<Commentaire> findByAnnonceVoitureReferance(String referance) {
		return null;
	}

	@Override
	public List<Commentaire> findByAnnonceImmobilierReferance(String referance) {
		 return commentaireDao.findByAnnonceImmobilierReferance(referance);
	}

	@Override
	public int save(Commentaire commentaire) {
		Commentaire foundedCommentaire = findByTitre(commentaire.getTitre());

		if (foundedCommentaire != null) {
			return -1;
		} else {
			commentaireDao.save(commentaire);
			return 1;
		}
		
	}

	@Override
	public Commentaire deleteBytitre(String titre) {
		return commentaireDao.deleteBytitre(titre);
		}


	

}
