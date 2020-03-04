package com.project.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Annonceur;
import com.project.bean.Review;
import com.project.bean.TypeReview;
import com.project.dao.ReviewDao;
import com.project.service.façade.ReviewService;

@Service
public class ReviewImpl implements ReviewService {

	@Autowired
	ReviewDao reviewDao;
	
	@Override
	public int save(Review review) {
		List<Review> reviewFounded = findByAnnonceur(review.getAnnonceur());
		if( reviewFounded != null)
			return -1;
		else {
			reviewDao.save(review);
		return 1;
		}
		}

	@Override
	public List<Review> findAll() {
		return reviewDao.findAll();
	}

	@Override
	public List<Review> findByAnnonceur(Annonceur annonceur) {
		return reviewDao.findByAnnonceur(annonceur);
	}

	@Override
	public List<Review> findByTypeReview(TypeReview typeReview) {
		return reviewDao.findByTypeReview(typeReview);
	}

	@Override
	public int update(String reference, TypeReview typeReview, Date dateReview) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Review findByReference(String reference) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> findByDateReview(Date dateReview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByReference(String reference) {
		// TODO Auto-generated method stub
		return 0;
	}

}
