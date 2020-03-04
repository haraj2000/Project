package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;
import com.project.service.façade.AnnonceurService;

@RestController
@RequestMapping("project/Annonceur")
public class AnnonceurRest {

	@Autowired
	private AnnonceurService annonceurService;

	public int save(@RequestBody Annonceur annonceur) {
		return annonceurService.save(annonceur);
	}

	public List<Annonceur> findAll() {
		return annonceurService.findAll();
	}

	public int deleteByMail(@PathVariable String mail) {
		return annonceurService.deleteByMail(mail);
	}

	public int update(@PathVariable String mail, @PathVariable String firstName, @PathVariable String lastName,@PathVariable int phoneNumber, @PathVariable String country, @PathVariable String city,
			@PathVariable String address) {
		return annonceurService.update(mail, firstName, lastName, phoneNumber, country, city, address);
	}

	public List<Annonceur> findByFisrtName(@PathVariable String firstName) {
		return annonceurService.findByFisrtName(firstName);
	}

	public List<Annonceur> findByLastName(@PathVariable String lastName) {
		return annonceurService.findByLastName(lastName);
	}

	public Annonceur findByMail(@PathVariable String mail) {
		return annonceurService.findByMail(mail);
	}

	public List<Annonceur> findByCountry(@PathVariable String country) {
		return annonceurService.findByCountry(country);
	}

	public List<Annonceur> findByCity(@PathVariable String city) {
		return annonceurService.findByCity(city);
	}

	public List<Annonceur> findByTypeAnnonceur(@RequestBody TypeAnnonceur typeAnnonceur) {
		return annonceurService.findByTypeAnnonceur(typeAnnonceur);
	}
}
