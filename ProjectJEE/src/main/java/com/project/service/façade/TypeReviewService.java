package com.project.service.façade;

import java.util.List;

import com.project.bean.Review;
import com.project.bean.TypeReview;

public interface TypeReviewService {

	public void save(TypeReview typeReview);
	public List<TypeReview> findAll();
	public TypeReview findByReview(Review review);
	public List<TypeReview> fidnByNbrStars (int nbrstars);
	
}
