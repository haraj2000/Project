package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.TypeAnnonceur;
import com.project.service.facade.TypeAnnonceurService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
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
	@GetMapping("Reference/{reference}")
	public TypeAnnonceur findByReference(String reference) {
		return typeAnnonceurService.findByReference(reference);
	}
	@DeleteMapping("/Reference/{reference}")
	public int deleteByReference(String reference) {
		return typeAnnonceurService.deleteByReference(reference);
	}
	
	
}
