package com.project.service.façade;

import java.util.List;

import com.project.bean.Carburant;


public interface CarburantService {

	public Carburant findByLibelle(String libelle);
	public Carburant findByEnergie(String energie);
    public List<Carburant> findByAnnonceVoitureReferance(String referance);
    public List<Carburant> findByAnnonceVoitureReferanceAndLibelle(String referance, String libelle);
	public void save(Carburant carburant);
	public List<Carburant> findAll();
	public Carburant deleteByLibelle(String libelle);

}
