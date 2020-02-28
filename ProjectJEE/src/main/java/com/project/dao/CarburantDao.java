package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Carburant;

@Repository
public interface CarburantDao extends JpaRepository<Carburant, Long> {
	
	public Carburant findById(long id);
    public List<Carburant> findByAnnonceVoitureReferance(String referance);

}
