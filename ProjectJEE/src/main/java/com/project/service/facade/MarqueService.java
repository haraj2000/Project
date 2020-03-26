package com.project.service.facade;

import java.util.List;

import com.project.bean.Marque;

public interface MarqueService {

	public Marque findByNom(String nom);
	
	public List<Marque> findByModeleVersion(String version);
	
	public int save(Marque marque);

	public int restituer(String nom);

	public List<Marque> findAll();

	public Marque deleteByNom(String nom);

}
