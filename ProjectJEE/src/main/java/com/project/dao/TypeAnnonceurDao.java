package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;

@Repository
public interface TypeAnnonceurDao extends JpaRepository<TypeAnnonceur, Long> {
	
	public TypeAnnonceur findByAnnonceur(Annonceur annonceur);
	public TypeAnnonceur findByLibelle(String libelle);

}
