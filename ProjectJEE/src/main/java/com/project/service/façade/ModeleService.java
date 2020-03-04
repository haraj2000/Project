package com.project.service.façade;

import java.util.List;

import com.project.bean.Marque;
import com.project.bean.Modele;

public interface ModeleService {
	
public Marque findByVersion(String version);
	
	public Marque findByNom(String nom);

	public Marque findByAnnee(int annee);
	
	public int save(Modele modele);

	public int restituer(String nom);

	public List<Modele> findAll();

}
