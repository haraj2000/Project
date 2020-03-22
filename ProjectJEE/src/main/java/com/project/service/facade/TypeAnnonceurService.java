package com.project.service.facade;

import java.util.List;

import com.project.bean.TypeAnnonceur;

public interface TypeAnnonceurService {

	public int save(TypeAnnonceur typeAnnonceur);
	public List<TypeAnnonceur> findAll();
	public TypeAnnonceur findByLibelle(String libelle);
	public TypeAnnonceur findByReference(String reference);
	public int deleteByReference(String reference);
}
