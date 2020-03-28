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

import com.project.bean.Marque;
import com.project.service.facade.MarqueService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("project/Marque")
public class MarqueRest {
	@Autowired
	private MarqueService marqueService;

	@DeleteMapping("/nom/{nom}")
	public int deleteByNom(@PathVariable String nom) {
		return marqueService.deleteByNom(nom);
	}

	@GetMapping("/nom/{nom}")
	public Marque findByNom(@PathVariable String nom) {
		return marqueService.findByNom(nom);
	}

	@GetMapping("/Modele/version/{version}")
	public List<Marque> findByModeleVersion(@PathVariable String version) {
		return marqueService.findByModeleVersion(version);
	}

	@PostMapping("/")
	public int save(@RequestBody Marque marque) {
		return marqueService.save(marque);
	}

	@PutMapping("/nom/{nom}")
	public int restituer(@PathVariable String nom) {
		return marqueService.restituer(nom);
	}

	@GetMapping("/")
	public List<Marque> findAll() {
		return marqueService.findAll();
	}

}
