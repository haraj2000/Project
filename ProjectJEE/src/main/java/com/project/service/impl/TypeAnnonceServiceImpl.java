package com.project.service.impl;

import java.util.List;

import com.project.bean.TypeAnnonce;
import com.project.dao.TypeAnnonceDao;
import com.project.service.facade.TypeAnnonceService;

public class TypeAnnonceServiceImpl implements TypeAnnonceService {
	
	private TypeAnnonceDao typeAnnonceDao;

	@Override
	public TypeAnnonce findByLibelle(String libelle) {
		return typeAnnonceDao.findByLibelle(libelle) ;
	}

	@Override
	public int save(TypeAnnonce typeAnnonce) {
		typeAnnonceDao.save(typeAnnonce);
		return 1;
	}

	@Override
	public List<TypeAnnonce> findAll() {
		return typeAnnonceDao.findAll() ;
	}


}
