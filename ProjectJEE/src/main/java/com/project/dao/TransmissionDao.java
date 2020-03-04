package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Commentaire;
import com.project.bean.Transmission;

@Repository
public interface TransmissionDao extends JpaRepository<Transmission, Long> {
	
	public Transmission findByLibelle(String libelle);
	public List<Transmission> findByAnnonceVoitureReferance(String referance);
	public List<Transmission> findByAnnonceVoitureReferanceAndLibelle(String referance, String libelle);

}
