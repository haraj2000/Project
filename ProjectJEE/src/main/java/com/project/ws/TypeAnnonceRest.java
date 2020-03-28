package com.project.ws;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.TypeAnnonce;
import com.project.service.facade.TypeAnnonceService;

@RestController
@RequestMapping("project/TypeAnnonce")
public class TypeAnnonceRest {
	
	private TypeAnnonceService typeAnnonceService;

	@GetMapping("/libelle/{libelle}")
	public TypeAnnonce findByLibelle(@PathVariable String libelle) {
		return typeAnnonceService.findByLibelle(libelle);
	}

	@PostMapping("/")
	public int save(@RequestBody TypeAnnonce typeAnnonce) {
		return typeAnnonceService.save(typeAnnonce);
	}

	@GetMapping("/")
	public List<TypeAnnonce> findAll() {
		return typeAnnonceService.findAll();
	}

}
