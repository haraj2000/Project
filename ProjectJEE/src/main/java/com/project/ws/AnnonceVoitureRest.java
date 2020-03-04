package com.project.ws;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.AnnonceVoiture;
import com.project.service.façade.AnnonceVoitureService;

@RestController
@RequestMapping("project/AnnonceVoiture")
public class AnnonceVoitureRest {
	@Autowired
	private AnnonceVoitureService annonceVoitureService;

	public AnnonceVoiture findByReferance(String referance) {
		return annonceVoitureService.findByReferance(referance);
	}

	public List<AnnonceVoiture> findByMarqueNom(String nom) {
		return annonceVoitureService.findByMarqueNom(nom);
	}

	public List<AnnonceVoiture> findPrix(BigDecimal prix) {
		return annonceVoitureService.findPrix(prix);
	}

	public List<AnnonceVoiture> findByKilometrage(Long kilometrage) {
		return annonceVoitureService.findByKilometrage(kilometrage);
	}

	public List<AnnonceVoiture> findByCouleur(String couleur) {
		return annonceVoitureService.findByCouleur(couleur);
	}

	public int save(AnnonceVoiture annonceVoiture) {
		return annonceVoitureService.save(annonceVoiture);
	}

	public int restituer(String reference) {
		return annonceVoitureService.restituer(reference);
	}

	public List<AnnonceVoiture> findAll() {
		return annonceVoitureService.findAll();
	}

	
}
