package com.project.service.façade;

import java.util.Date;
import java.util.List;

import com.project.bean.Annonceur;
import com.project.bean.Review;
import com.project.bean.TypeReview;

public interface ReviewService {

	public int save(Review review);
	public List<Review> findAll();
	public int update(Review review);
	
	public Review findByReference(String reference);
	public List<Review> findByAnnonceur(Annonceur annonceur);
	public List<Review> findByTypeReview(TypeReview typeReview);
	public List<Review> findByDateReview(Date dateReview);
	public int deleteByReference(String reference);
}
