package com.project.service.façade;

import java.util.List;

import com.project.bean.Annonceur;

public interface AnnonceurService {

	public Annonceur findByLogin(String login);
	public List<Annonceur> findByLastName(String lastName);
	public Annonceur findByMail(String mail);
}
