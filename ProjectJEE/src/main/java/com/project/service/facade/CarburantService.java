package com.project.service.facade;

import java.util.List;

import com.project.bean.Carburant;


public interface CarburantService {

	public Carburant findByLibelle(String libelle);
	public Carburant findByEnergie(String energie);
    public List<Carburant> findByAnnonceVoitureReference(String reference);
    public List<Carburant> findByAnnonceVoitureReferenceAndLibelle(String reference, String libelle);
	public int save(Carburant carburant);
	public List<Carburant> findAll();
	public Carburant deleteByLibelle(String libelle);

}
