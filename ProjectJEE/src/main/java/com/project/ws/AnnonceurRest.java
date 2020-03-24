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

import com.project.bean.Annonceur;
import com.project.bean.TypeAnnonceur;
import com.project.service.facade.AnnonceurService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("project/Annonceur")
public class AnnonceurRest {

	@Autowired
	private AnnonceurService annonceurService;

	@PostMapping("/")
	public int save(@RequestBody Annonceur annonceur) {
		return annonceurService.save(annonceur);
	}

	@GetMapping("/all")
	public List<Annonceur> findAll() {
		return annonceurService.findAll();
	}
	@DeleteMapping("/mail/{mail}")
	public int deleteByMail(@PathVariable String mail) {
		return annonceurService.deleteByMail(mail);
	}
	@PutMapping("/")
	public int update(@RequestBody Annonceur annonceur) {
		return annonceurService.update(annonceur);
	}
	@GetMapping("/firstName/{fisrtName}")
	public List<Annonceur> findByFisrtName(@PathVariable String firstName) {
		return annonceurService.findByFirstName(firstName);
	}
	@GetMapping("/lastName/{lastName}")
	public List<Annonceur> findByLastName(@PathVariable String lastName) {
		return annonceurService.findByLastName(lastName);
	}
	@GetMapping("/mail/{mail}")
	public Annonceur findByMail(@PathVariable String mail) {
		return annonceurService.findByMail(mail);
	}
	@GetMapping("/city/{city}")
	public List<Annonceur> findByCity(@PathVariable String city) {
		return annonceurService.findByCity(city);
	}
	@GetMapping("/")
	public List<Annonceur> findByTypeAnnonceur(@RequestBody TypeAnnonceur typeAnnonceur) {
		return annonceurService.findByTypeAnnonceur(typeAnnonceur);
	}
	
}
