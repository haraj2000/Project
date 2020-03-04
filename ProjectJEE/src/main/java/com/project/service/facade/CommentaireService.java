package com.project.service.facade;

import java.util.List;

import com.project.bean.Commentaire;

public interface CommentaireService {
	
	public Commentaire findByTitre(String titre);
	public List<Commentaire> findByAnnonceVoitureReferance(String referance);
	public List<Commentaire> findByAnnonceImmobilierReferance(String referance);
	public int save(Commentaire commentaire);
	public Commentaire deleteBytitre(String titre);

}
