package com.project.service.façade;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;

public interface TypeAnnonceurService {

	public TypeAnnonceur findByAnnonceur(Annonceur annonceur);
	public TypeAnnonceur findByLibelle(String libelle);
}
