package com.project.ws;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.TypeImmobilier;
import com.project.service.facade.TypeImmobilierService;

@RestController
@RequestMapping("project/TypeImmobilier")
public class TypeImmobilierRest {
	
	private TypeImmobilierService typeImmobilierService;

	@GetMapping("/libelle/{libelle}")
	public TypeImmobilier findByLibelle(@PathVariable String libelle) {
		return typeImmobilierService.findByLibelle(libelle);
	}

	@PostMapping("/")
	public int save(@RequestBody TypeImmobilier typeImmobilier) {
		typeImmobilierService.save(typeImmobilier);
		return 1;
	}

	@GetMapping("/")
	public List<TypeImmobilier> findAll() {
		return typeImmobilierService.findAll();
	}

}
