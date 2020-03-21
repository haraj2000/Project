package com.project.ws;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.AnnonceVoiture;
import com.project.service.facade.AnnonceVoitureService;

@RestController
@RequestMapping("project/AnnonceVoiture")
public class AnnonceVoitureRest {
	@Autowired
	private AnnonceVoitureService annonceVoitureService;

	@GetMapping("/referance/{reference}")
	public AnnonceVoiture findByReferance(@PathVariable String reference) {
		return annonceVoitureService.findByReference(reference);
	}

	@GetMapping("/Marque/nom/{nom}")
	public List<AnnonceVoiture> findByMarqueNom(@PathVariable String nom) {
		return annonceVoitureService.findByMarqueNom(nom);
	}

	@GetMapping("/prix/{prix}")
	public List<AnnonceVoiture> findByPrix(@PathVariable BigDecimal prix) {
		return annonceVoitureService.findByPrix(prix);
	}

	@GetMapping("/kilometrage/{kilometrage}")
	public List<AnnonceVoiture> findByKilometrage(@PathVariable Long kilometrage) {
		return annonceVoitureService.findByKilometrage(kilometrage);
	}

	@GetMapping("/couleur/{couleur}")
	public List<AnnonceVoiture> findByCouleur(@PathVariable String couleur) {
		return annonceVoitureService.findByCouleur(couleur);
	}

	@PostMapping("/")
	public int save(@RequestBody AnnonceVoiture annonceVoiture) {
		return annonceVoitureService.save(annonceVoiture);
	}

	@PutMapping("/reference/{reference}/prix/{prix}")
	public int restituer(@PathVariable String reference,@PathVariable BigDecimal prix) {
		return annonceVoitureService.restituer(reference, prix);
	}

	@GetMapping("/")
	public List<AnnonceVoiture> findAll() {
		return annonceVoitureService.findAll();
	}

}
