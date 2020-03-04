package com.project.service.façade;

import java.util.List;

import com.project.bean.Carburant;


public interface CarburantService {


	public void save(Carburant annonceImmobilier);

	public List<Carburant> findAll();

}
