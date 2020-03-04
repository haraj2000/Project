package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Carburant;

@Repository
public interface CarburantDao extends JpaRepository<Carburant, Long> {
	
	public Carburant findByLibelle(String libelle);
	public Carburant findByEnergie(String energie);
    public List<Carburant> findByAnnonceVoitureReferance(String referance);
    public List<Carburant> findByAnnonceVoitureReferanceAndLibelle(String referance, String libelle);
    public Carburant deleteByLibelle(String libelle);
    

}
