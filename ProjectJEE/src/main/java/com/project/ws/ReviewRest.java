package com.project.ws;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Annonceur;
import com.project.bean.Review;
import com.project.bean.TypeReview;
import com.project.service.façade.ReviewService;

@RestController
@RequestMapping("project/Review")
public class ReviewRest {

	@Autowired
	private ReviewService reviewService;

	@PostMapping("/")
	public int save(@RequestBody Review review) {
		return reviewService.save(review);
	}
	@GetMapping("/")
	public List<Review> findAll() {
		return reviewService.findAll();
	}
	@GetMapping("/Review/{review}")
	public int update(@RequestBody Review review) {
		return reviewService.update(review);
	}
	@GetMapping("/Reference/{reference}")
	public Review findByReference(@PathVariable String reference) {
		return reviewService.findByReference(reference);
	}
	@GetMapping("/Annonceur/{annonceur}")
	public List<Review> findByAnnonceur(@RequestBody Annonceur annonceur) {
		return reviewService.findByAnnonceur(annonceur);
	}
	@GetMapping("TypeReview/{typeReview}")
	public List<Review> findByTypeReview(@RequestBody TypeReview typeReview) {
		return reviewService.findByTypeReview(typeReview);
	}
	@GetMapping("/DateReview/{dateReview}")
	public List<Review> findByDateReview(@PathVariable Date dateReview) {
		return reviewService.findByDateReview(dateReview);
	}
	@GetMapping("/Reference/{reference}")
	public int deleteByReference(@PathVariable String reference) {
		return reviewService.deleteByReference(reference);
	}
}
