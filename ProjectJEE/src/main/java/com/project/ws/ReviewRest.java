package com.project.ws;

import java.util.Date;
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
import com.project.bean.Review;
import com.project.bean.TypeReview;
import com.project.service.facade.ReviewService;

@RestController
@CrossOrigin(origins = {"http://localhost:8090"})
@RequestMapping("project/Review")
public class ReviewRest {

	@Autowired
	private ReviewService reviewService;

	@PostMapping("/")
	public int save(@RequestBody Review review) {
		return reviewService.save(review);
	}
	@GetMapping("/all")
	public List<Review> findAll() {
		return reviewService.findAll();
	}
	@PutMapping("/")
	public int update(@RequestBody Review review) {
		return reviewService.update(review);
	}
	@GetMapping("/reference/{reference}")
	public Review findByReference(@PathVariable String reference) {
		return reviewService.findByReference(reference);
	}
	@GetMapping("/findByAnnonceur")
	public List<Review> findByAnnonceur(@RequestBody Annonceur annonceur) {
		return reviewService.findByAnnonceur(annonceur);
	}
	@GetMapping("/findByTypeReview")
	public List<Review> findByTypeReview(@RequestBody TypeReview typeReview) {
		return reviewService.findByTypeReview(typeReview);
	}
	@GetMapping("/dateReview/{dateReview}")
	public List<Review> findByDateReview(@PathVariable Date dateReview) {
		return reviewService.findByDateReview(dateReview);
	}
	@DeleteMapping("/reference/{reference}")
	public int deleteByReference(@PathVariable String reference) {
		return reviewService.deleteByReference(reference);
	}
}
