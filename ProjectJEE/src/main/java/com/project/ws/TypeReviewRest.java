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

import com.project.bean.TypeReview;
import com.project.service.facade.TypeReviewService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("project/TypeReview")
public class TypeReviewRest {

	@Autowired
	private TypeReviewService typeReviewService;

	@PostMapping("/")
	public int save(@RequestBody TypeReview typeReview) {
		return typeReviewService.save(typeReview);
	}
	@GetMapping("/")
	public List<TypeReview> findAll() {
		return typeReviewService.findAll();
	}
	@GetMapping("/Reference/{reference}")
	public TypeReview findByReference(@PathVariable String reference) {
		return typeReviewService.findByReference(reference);
	}
	
	@GetMapping("/Nbrstars/{nbrstars}")
	public List<TypeReview> fidnByNbrStars(@PathVariable int nbrstars) {
		return typeReviewService.fidnByNbrStars(nbrstars);
	}
	@DeleteMapping("/Reference/{refrence}")
	public int deleteByReference(String reference) {
		return typeReviewService.deleteByReference(reference);
	}
	
	
}
