package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.AnnonceImmobilier;
import com.project.service.facade.AnnonceImmobilierService;

@RestController
@RequestMapping("/projet/AnnonceImmobilier")
public class AnnonceImmobilierRest {
	
	@Autowired
	private AnnonceImmobilierService annonceImmobilierService;

	@GetMapping("/reference/{reference}")
	public AnnonceImmobilier findByReference(@PathVariable String reference) {
		return annonceImmobilierService.findByReference(reference);
	}

	@PostMapping("/")
	public int save(AnnonceImmobilier annonceImmobilier) {
		return annonceImmobilierService.save(annonceImmobilier);
	}

	@GetMapping("/")
	public List<AnnonceImmobilier> findAll() {
		return annonceImmobilierService.findAll();
	}

	@PutMapping("/")
	public int update(@RequestBody AnnonceImmobilier annonceImmobilier) {
		return annonceImmobilierService.update(annonceImmobilier);
	}

	@DeleteMapping("/reference/{reference}")
	public AnnonceImmobilier deleteByReference(@PathVariable String reference) {
		return annonceImmobilierService.deleteByReference(reference);
	}

	@GetMapping("/prix/{prix}")
	public AnnonceImmobilier findByPrix(@PathVariable String prix) {
		return annonceImmobilierService.findByPrix(prix);
	}

	@GetMapping("/titreAnnonce/{titreAnnonce}")
	public AnnonceImmobilier findByTitreAnnonce(@PathVariable String titreAnnonce) {
		return annonceImmobilierService.findByTitreAnnonce(titreAnnonce);
	}

	@GetMapping("/villeImm/{villeImm}")
	public AnnonceImmobilier findByVilleImm(@PathVariable String villeImm) {
		return annonceImmobilierService.findByVilleImm(villeImm);
	}

}
