package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.Review;
import com.project.bean.TypeReview;

@Repository
public interface TypeReviewDao extends JpaRepository<TypeReview, Long> {
	
	public TypeReview findByReview(Review review);
	public List<TypeReview> fidnByNbrStars (int nbrstars);

}
