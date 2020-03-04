package com.project.service.façade;

import java.util.List;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;

public interface AnnonceurService {

	public int save(Annonceur annonceur);
	public List<Annonceur> findAll();
	public int deleteByLogin(String login);
	public int update(String mail,String firstName, String lastName, int phoneNumber, String country, String city, String address);
	
	public List<Annonceur> findByFisrtName(String firstName);
	public List<Annonceur> findByLastName(String lastName);
	public Annonceur findByMail(String mail);
	public List<Annonceur> findByCountry(String country);
	public List<Annonceur> findByCity(String city);
	public List<Annonceur> findByTypeAnnonceur(TypeAnnonceur typeAnnonceur);
}
