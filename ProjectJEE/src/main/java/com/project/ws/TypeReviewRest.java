package com.project.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Review;
import com.project.bean.TypeReview;
import com.project.service.façade.TypeReviewService;

@RestController
@RequestMapping("project/TypeReview")
public class TypeReviewRest {

	@Autowired
	private TypeReviewService typeReviewService;

	public int save(@RequestBody TypeReview typeReview) {
		return typeReviewService.save(typeReview);
	}

	public List<TypeReview> findAll() {
		return typeReviewService.findAll();
	}

	public TypeReview findByReference(@PathVariable String reference) {
		return typeReviewService.findByReference(reference);
	}

	public TypeReview findByReview(@RequestBody Review review) {
		return typeReviewService.findByReview(review);
	}

	public List<TypeReview> fidnByNbrStars(@PathVariable int nbrstars) {
		return typeReviewService.fidnByNbrStars(nbrstars);
	}
	
}
