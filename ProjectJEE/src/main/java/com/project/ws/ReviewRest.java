package com.project.ws;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

	public int save(@RequestBody Review review) {
		return reviewService.save(review);
	}

	public List<Review> findAll() {
		return reviewService.findAll();
	}

	public int update(@PathVariable String reference, @RequestBody TypeReview typeReview, @PathVariable Date dateReview) {
		return reviewService.update(reference, typeReview, dateReview);
	}

	public Review findByReference(@PathVariable String reference) {
		return reviewService.findByReference(reference);
	}

	public List<Review> findByAnnonceur(@RequestBody Annonceur annonceur) {
		return reviewService.findByAnnonceur(annonceur);
	}

	public List<Review> findByTypeReview(@RequestBody TypeReview typeReview) {
		return reviewService.findByTypeReview(typeReview);
	}

	public List<Review> findByDateReview(@PathVariable Date dateReview) {
		return reviewService.findByDateReview(dateReview);
	}

	public int deleteByReference(@PathVariable String reference) {
		return reviewService.deleteByReference(reference);
	}
}
