package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	public Marque findByVersion(String version) {
		return modeleService.findByVersion(version);
	}

	public Marque findByNom(String nom) {
		return modeleService.findByNom(nom);
	}

	public Marque findByAnnee(int annee) {
		return modeleService.findByAnnee(annee);
	}

	public int save(Modele modele) {
		return modeleService.save(modele);
	}

	public int restituer(String nom) {
		return modeleService.restituer(nom);
	}

	public List<Modele> findAll() {
		return modeleService.findAll();
	}

}
