package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.AnnonceVoiture;
import com.project.bean.Carburant;
import com.project.bean.Commentaire;

@Repository
public interface CommentaireDao extends JpaRepository<Commentaire, Long> {

	public List<Commentaire> findByAnnonceVoitureReferance(String referance);
	public List<Commentaire> findByAnnonceImmobilierReferance(String referance);
	public Commentaire deleteBytitre(String titre);

	
}
