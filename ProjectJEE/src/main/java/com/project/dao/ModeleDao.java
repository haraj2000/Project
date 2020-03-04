package com.project.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Marque;
import com.project.bean.Modele;

@Repository
public interface ModeleDao extends JpaRepository<Modele, String> {

	public Marque findByVersion(String version);
	
	public Marque findByNom(String nom);

	public Marque findByAnnee(int annee);
}
