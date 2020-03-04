package com.project.service.façade;

import java.util.List;

import com.project.bean.TypeImmobilier;

public interface TypeImmobilierService {

	public TypeImmobilier findByLibelle(String libelle);

	public void save(TypeImmobilier typeImmobilier);

	public List<TypeImmobilier> findAll();

}
