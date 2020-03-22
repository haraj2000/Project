package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Transmission;
import com.project.service.facade.TransmissionService;

@RestController
@RequestMapping("project/Transmission")
public class TransmissionRest {
	@Autowired
	private TransmissionService transmissionService;

	@GetMapping("/libelle/{libelle}")
	public Transmission findByLibelle(@PathVariable String libelle) {
		return transmissionService.findByLibelle(libelle);
	}

	@GetMapping("/Annoncevoiture/libelle/{libelle}")
	public List<Transmission> findByAnnonceVoitureReference(@PathVariable String reference) {
		return transmissionService.findByAnnonceVoitureReference(reference);
	}

	@GetMapping("/AnnonceVoiture/referance/{referance}/libelle/{libelle}")
	public List<Transmission> findByAnnonceVoitureReferanceAndLibelle(@PathVariable String reference,@PathVariable String libelle) {
		return transmissionService.findByAnnonceVoitureReferenceAndLibelle(reference, libelle);
	}

	@PostMapping("/")
	public int save(@RequestBody Transmission transmission) {
		return transmissionService.save(transmission);
	}

	@GetMapping("/")
	public List<Transmission> findAll() {
		return transmissionService.findAll();
	}

	@DeleteMapping("libelle/{libelle}")
	public Transmission deleteByLibelle(@PathVariable String libelle) {
		return transmissionService.deleteByLibelle(libelle);
	}
	

}
