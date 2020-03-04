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

import com.project.bean.Carburant;
import com.project.service.façade.CarburantService;

@RestController
@RequestMapping("project/Carburant")
public class CarburantRest {
	@Autowired
	private CarburantService carburantService;

	@GetMapping("/energie/{energie}")
	public Carburant findByEnergie(@PathVariable String energie) {
		return carburantService.findByEnergie(energie);
	}
    
	@GetMapping("/libelle/{libelle}")
	public Carburant findByLibelle(@PathVariable String libelle) {
		return carburantService.findByLibelle(libelle);
	}
    @GetMapping("/AnnonceVoiture/referance/{referance}")
	public List<Carburant> findByAnnonceVoitureReferance(@PathVariable String referance) {
		return carburantService.findByAnnonceVoitureReferance(referance);
	}
   
    @DeleteMapping("/libelle/{libelle}")
    public Carburant deleteByLibelle(String libelle) {
		return carburantService.deleteByLibelle(libelle);
	}

	@GetMapping("/AnnonceVoiture/referance/{referance}/libelle/{libelle}")
	public List<Carburant> findByAnnonceVoitureReferanceAndLibelle(@PathVariable String referance,@PathVariable String libelle) {
		return carburantService.findByAnnonceVoitureReferanceAndLibelle(referance, libelle);
	}

    @PostMapping("/")
	public void save(@RequestBody Carburant carburant) {
		carburantService.save(carburant);
	}
    @GetMapping("/")
	public List<Carburant> findAll() {
		return carburantService.findAll();
	}

	

}
