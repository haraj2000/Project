package com.project.service.facade;

import java.util.List;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;

public interface AnnonceurService {

	public int save(Annonceur annonceur);
	public List<Annonceur> findAll();
	public int deleteByMail(String mail);
	public int update(Annonceur annonceur);	
	public List<Annonceur> findByFirstName(String firstName);
	public List<Annonceur> findByLastName(String lastName);
	public Annonceur findByMail(String mail);
	public List<Annonceur> findByCity(String city);
	public List<Annonceur> findByTypeAnnonceur(TypeAnnonceur typeAnnonceur);
}
