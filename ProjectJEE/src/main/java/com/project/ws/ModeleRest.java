package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Modele;
import com.project.service.facade.ModeleService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("project/Modele")
public class ModeleRest {
	@Autowired
	private ModeleService modeleService;

	
	@DeleteMapping("/version/{version}")
	public int deleteByVersion(String version) {
		return modeleService.deleteByVersion(version);
	}

	@GetMapping("/version/{version}")
	public Modele findByVersion(@PathVariable String version) {
		return modeleService.findByVersion(version);
	}

	@GetMapping("/nom/{nom}")
	public Modele findByNom(@PathVariable String nom) {
		return modeleService.findByNom(nom);
	}

	@GetMapping("/annee/{annee}")
	public Modele findByAnnee(@PathVariable int annee) {
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
