package com.project.service.facade;

import java.util.List;

import com.project.bean.TypeAnnonce;

public interface TypeAnnonceService {

	public TypeAnnonce findByLibelle(String libelle);

	public void save(TypeAnnonce typeAnnonce);

	public List<TypeAnnonce> findAll();


}
