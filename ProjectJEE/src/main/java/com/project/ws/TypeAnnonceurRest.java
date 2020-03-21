package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;
import com.project.service.facade.TypeAnnonceurService;

@RestController
@RequestMapping("project/TypeAnnonceur")
public class TypeAnnonceurRest {

	@Autowired
	private TypeAnnonceurService typeAnnonceurService;

	@PostMapping("/")
	public int save(@RequestBody TypeAnnonceur typeAnnonceur) {
		return typeAnnonceurService.save(typeAnnonceur);
	}
	@GetMapping("/")
	public List<TypeAnnonceur> findAll() {
		return typeAnnonceurService.findAll();
	}
	
	@GetMapping("Libelle/{libelle}")
	public TypeAnnonceur findByLibelle(@PathVariable String libelle) {
		return typeAnnonceurService.findByLibelle(libelle);
	}
	@GetMapping("delete/Libelle/{libelle}")
	public int deleteByLibelle(String libelle) {
		return typeAnnonceurService.deleteByLibelle(libelle);
	}
	
}
