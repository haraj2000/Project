package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.TypeReview;

@Repository
public interface TypeReviewDao extends JpaRepository<TypeReview, Long> {
	
	public TypeReview findByReference(String reference);
	public List<TypeReview> findByNbrStars (int nbrstars);
	public int deleteByReference(String reference);
}
