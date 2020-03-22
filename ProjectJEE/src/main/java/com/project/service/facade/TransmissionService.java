package com.project.service.facade;

import java.util.List;

import com.project.bean.Transmission;


public interface TransmissionService {
	public Transmission findByLibelle(String libelle);
	public List<Transmission> findByAnnonceVoitureReference(String reference);
	public List<Transmission> findByAnnonceVoitureReferenceAndLibelle(String reference, String libelle);
	public int save(Transmission transmission);
	public List<Transmission> findAll();

	 public Transmission deleteByLibelle(String libelle);

}
