package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;


@Repository
public interface AnnonceurDao extends JpaRepository<Annonceur, Long> {
	
	public Annonceur findByLogin(String login);
	public List<Annonceur> findByFisrtName(String firstName);
	public List<Annonceur> findByLastName(String lastName);
	public Annonceur findByMail(String mail);
	public List<Annonceur> findByCountry(String country);
	public List<Annonceur> findByCity(String city);
	public List<Annonceur> findByTypeAnnonceur(TypeAnnonceur typeAnnonceur);
}
