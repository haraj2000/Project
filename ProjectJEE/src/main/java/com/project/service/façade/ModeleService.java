package com.project.service.façade;

import java.util.List;

import com.project.bean.Marque;
import com.project.bean.Modele;

public interface ModeleService {
	
public Modele findByVersion(String version);
	
	public Modele findByNom(String nom);

	public Modele findByAnnee(int annee);
	
	public int save(Modele modele);

	public int restituer(String nom);

	public List<Modele> findAll();

}
