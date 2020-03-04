package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;
import com.project.service.façade.TypeAnnonceurService;

@RestController
@RequestMapping("project/TypeAnnonceur")
public class TypeAnnonceurRest {

	@Autowired
	private TypeAnnonceurService typeAnnonceurService;

	public int save(@RequestBody TypeAnnonceur typeAnnonceur) {
		return typeAnnonceurService.save(typeAnnonceur);
	}

	public List<TypeAnnonceur> findAll() {
		return typeAnnonceurService.findAll();
	}

	public TypeAnnonceur findByAnnonceur(@RequestBody Annonceur annonceur) {
		return typeAnnonceurService.findByAnnonceur(annonceur);
	}

	public TypeAnnonceur findByLibelle(@PathVariable String libelle) {
		return typeAnnonceurService.findByLibelle(libelle);
	}
}
