package com.project.service.façade;

import java.util.List;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;

public interface TypeAnnonceurService {

	public void save(TypeAnnonceur typeAnnonceur);
	public List<TypeAnnonceur> findAll();
	public TypeAnnonceur findByAnnonceur(Annonceur annonceur);
	public TypeAnnonceur findByLibelle(String libelle);
}
