package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.AnnonceImmobilier;
import com.project.service.façade.AnnonceImmobilierService;

@RestController
@RequestMapping("/projet/AnnonceImmobilier")
public class AnnonceImmpbilierRest {
	
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

	@GetMapping("/AnnonceImmobilier/{AnnonceImmobilier}")
	public int update(@RequestBody AnnonceImmobilier annonceImmobilier) {
		return annonceImmobilierService.update(annonceImmobilier);
	}

	@GetMapping("/reference/{reference}")
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
	public AnnonceImmobilier findByVilleImm(String villeImm) {
		return annonceImmobilierService.findByVilleImm(villeImm);
	}

}
