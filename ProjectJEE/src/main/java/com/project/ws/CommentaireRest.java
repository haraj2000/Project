package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Commentaire;
import com.project.service.façade.CommentaireService;


@RestController
@RequestMapping("project/Commentaire")
public class CommentaireRest {
	@Autowired
	private CommentaireService commentaireService;

	@GetMapping("/AnnonceVoiture/reference/{reference}")
	public List<Commentaire> findByAnnonceVoitureReferance(@PathVariable String referance) {
		return commentaireService.findByAnnonceVoitureReferance(referance);
	}

	@GetMapping("/AnnonceImmobilier/reference/{reference}")
	public List<Commentaire> findByAnnonceImmobilierReferance(@PathVariable String referance) {
		return commentaireService.findByAnnonceImmobilierReferance(referance);
	}
	@DeleteMapping("/titre/{titre}")
	public Commentaire deleteBytitre(@PathVariable String titre) {
		return commentaireService.deleteBytitre(titre);
	}
 
	@PostMapping("/")
	public void save(Commentaire commentaire) {
		commentaireService.save(commentaire);
	}


}
