package com.project.service.facade;

import java.util.List;

import com.project.bean.Review;
import com.project.bean.TypeReview;

public interface TypeReviewService {

	public int save(TypeReview typeReview);
	public List<TypeReview> findAll();
	public TypeReview findByReference(String reference);
	public List<TypeReview> fidnByNbrStars (int nbrstars);
	public int deleteByReference(String reference);
}
