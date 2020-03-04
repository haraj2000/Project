package com.project.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Annonceur;
import com.project.bean.Review;
import com.project.bean.TypeReview;

@Repository
public interface ReviewDao extends JpaRepository<Review, Long>{

	public Review findByReference(String referenceReview);
	public List<Review> findByAnnonceur(Annonceur annonceur);
	public List<Review> findByTypeReview(TypeReview typeReview);
	public List<Review> findByDateReview(Date dateReview);
	
}
