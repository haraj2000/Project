package com.project.service.façade;

import java.util.List;

import com.project.bean.Annonceur;
import com.project.bean.Review;
import com.project.bean.TypeReview;

public interface ReviewService {

	public void save(Review review);
	public List<Review> findAll();
	public List<Review> findByAnnonceur(Annonceur annonceur);
	public List<Review> findByTypeReview(TypeReview typeReview);
}
