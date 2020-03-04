package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Review;
import com.project.bean.TypeReview;
import com.project.dao.TypeReviewDao;
import com.project.service.façade.TypeReviewService;

@Service
public class TypeReviewImpl implements TypeReviewService{

	@Autowired
	TypeReviewDao typeReviewDao;
	
	@Override
	public int save(TypeReview typeReview) {
		TypeReview typeReviewFounded = findByReview(typeReview.getReview());
		if( typeReviewFounded != null)
			return -1;
		else {
			typeReviewDao.save(typeReview);
		return 1;
		}
	}

	@Override
	public List<TypeReview> findAll() {
		return typeReviewDao.findAll();
	}

	@Override
	public TypeReview findByReview(Review review) {
		return typeReviewDao.findByReview(review);
	}

	@Override
	public List<TypeReview> fidnByNbrStars(int nbrstars) {
		return typeReviewDao.fidnByNbrStars(nbrstars);
	}

}
