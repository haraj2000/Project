package com.project.service.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Annonceur;
import com.project.bean.Review;
import com.project.bean.TypeReview;
import com.project.dao.ReviewDao;
import com.project.service.facade.ReviewService;

@Service
public class ReviewImpl implements ReviewService {

	@Autowired
	ReviewDao reviewDao;
	
	@Override
	public int save(Review review) {
		Review reviewFounded = findByReference(review.getReference());
		if( reviewFounded != null)
			return -1;
		else if (review.getAnnonceur()==null)
			return -2;
		else {
			review.setDateReview(new Date());
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
	public int update(Review review) {
		Review reviewFounded = findByReference(review.getReference());
		if( reviewFounded == null)
			return -1;
		else {
			reviewFounded.setTypeReview(review.getTypeReview());
			reviewFounded.setDateReview(new Date());
			reviewDao.save(reviewFounded);
			return 1;
		}
	}

	@Override
	public Review findByReference(String reference) {
		return reviewDao.findByReference(reference);
	}

	@Override
	public List<Review> findByDateReview(Date dateReview) {
		return reviewDao.findByDateReview(dateReview);
	}

	@Override
	@Transactional
	public int deleteByReference(String reference) {
		return reviewDao.deleteByReference(reference);
	}

}
