package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Marque;
import com.project.service.façade.MarqueService;

@RestController
@RequestMapping("project/Marque")
public class MarqueRest {
	@Autowired
	private MarqueService marqueService;

	public Marque findByNom(String nom) {
		return marqueService.findByNom(nom);
	}

	public List<Marque> findByModeleVersion(String version) {
		return marqueService.findByModeleVersion(version);
	}

	public int save(Marque marque) {
		return marqueService.save(marque);
	}

	public int restituer(String nom) {
		return marqueService.restituer(nom);
	}

	public List<Marque> findAll() {
		return marqueService.findAll();
	}


}
