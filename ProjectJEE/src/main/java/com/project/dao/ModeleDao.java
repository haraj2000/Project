package com.project.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Marque;
import com.project.bean.Modele;

@Repository
public interface ModeleDao extends JpaRepository<Modele, String> {

	public Modele findByVersion(String version);
	
	public Modele findByNom(String nom);

	public Modele findByAnnee(int annee);
	
	public int  deleteByVersion(String version);
}
