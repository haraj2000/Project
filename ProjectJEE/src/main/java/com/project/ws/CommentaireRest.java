package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Commentaire;
import com.project.service.facade.CommentaireService;


@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("project/Commentaire")
public class CommentaireRest {
	@Autowired
	private CommentaireService commentaireService;
	
	@GetMapping("/titre/{titre}")
	public Commentaire findByTitre(@PathVariable String titre) {
		return commentaireService.findByTitre(titre);
	}

	@GetMapping("/AnnonceVoiture/referance/{referance}")
	public List<Commentaire> findByAnnonceVoitureReferance(@PathVariable String referance) {
		return commentaireService.findByAnnonceVoitureReferance(referance);
	}

	@GetMapping("/AnnonceImmobilier/referance/{referance}")
	public List<Commentaire> findByAnnonceImmobilierReferance(@PathVariable String referance) {
		return commentaireService.findByAnnonceImmobilierReferance(referance);
	}
	@DeleteMapping("/titre/{titre}")
	public Commentaire deleteBytitre(@PathVariable String titre) {
		return commentaireService.deleteBytitre(titre);
	}
 
	@PostMapping("/")
	public int save(@RequestBody Commentaire commentaire) {
		return commentaireService.save(commentaire);
	}



}
