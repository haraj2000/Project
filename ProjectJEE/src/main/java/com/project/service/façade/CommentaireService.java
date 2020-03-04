package com.project.service.façade;

import java.util.List;

import com.project.bean.Carburant;
import com.project.bean.Commentaire;

public interface CommentaireService {
	public List<Commentaire> findByAnnonceVoitureReferance(String referance);
	public List<Commentaire> findByAnnonceImmobilierReferance(String referance);
	public void save(Commentaire commentaire);
	public Commentaire deleteBytitre(String titre);

}
