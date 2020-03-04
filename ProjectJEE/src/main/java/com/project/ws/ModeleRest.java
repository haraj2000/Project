package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Marque;
import com.project.bean.Modele;
import com.project.service.façade.ModeleService;

@RestController
@RequestMapping("project/Modele")
public class ModeleRest {
	@Autowired
	private ModeleService modeleService;

	@GetMapping("/version/{version}")
	public Marque findByVersion(@PathVariable String version) {
		return modeleService.findByVersion(version);
	}

	@GetMapping("/version/{version}")
	public Marque findByNom(@PathVariable String nom) {
		return modeleService.findByNom(nom);
	}

	@GetMapping("/version/{version}")
	public Marque findByAnnee(@PathVariable int annee) {
		return modeleService.findByAnnee(annee);
	}

	@PostMapping("/")
	public int save(@RequestBody Modele modele) {
		return modeleService.save(modele);
	}

	@PutMapping("/nom/{nom}")
	public int restituer(@PathVariable String nom) {
		return modeleService.restituer(nom);
	}

	@GetMapping("/")
	public List<Modele> findAll() {
		return modeleService.findAll();
	}

}
