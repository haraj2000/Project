package com.project.service.facade;

import java.util.List;

import com.project.bean.TypeImmobilier;

public interface TypeImmobilierService {

	public TypeImmobilier findByLibelle(String libelle);

	public int save(TypeImmobilier typeImmobilier);

	public List<TypeImmobilier> findAll();

}
