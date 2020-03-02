package com.project.service.façade;

import java.util.List;

import com.project.bean.TypeImmobilier;

public interface TypeImmobilierService {

	public TypeImmobilier findById(int id);

	public void save(TypeImmobilier typeImmobilier);

	public List<TypeImmobilier> findAll();

}
