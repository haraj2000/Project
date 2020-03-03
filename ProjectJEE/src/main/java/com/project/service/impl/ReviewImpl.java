package com.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.bean.Annonceur;
import com.project.bean.Review;
import com.project.bean.TypeReview;
import com.project.service.façade.ReviewService;

@Service
public class ReviewImpl implements ReviewService {

	@Override
	public void save(Review review) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Review> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> findByAnnonceur(Annonceur annonceur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> findByTypeReview(TypeReview typeReview) {
		// TODO Auto-generated method stub
		return null;
	}

}
