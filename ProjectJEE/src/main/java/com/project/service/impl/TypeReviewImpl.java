package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.Review;
import com.project.bean.TypeReview;
import com.project.dao.TypeReviewDao;
import com.project.service.facade.TypeReviewService;

@Service
public class TypeReviewImpl implements TypeReviewService {

	@Autowired
	TypeReviewDao typeReviewDao;

	@Override
	public int save(TypeReview typeReview) {
		TypeReview typeReviewFounded = findByReference(typeReview.getReference());
		if (typeReviewFounded != null)
			return -1;
		else if (typeReview.getNbrStars() > 5)
			return -2;
		else if (typeReview.getNbrStars() < 0)
			return -3;
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
	public List<TypeReview> fidnByNbrStars(int nbrstars) {
		return typeReviewDao.findByNbrStars(nbrstars);
	}

	@Override
	public TypeReview findByReference(String reference) {
		return typeReviewDao.findByReference(reference);
	}

	@Override
	public int deleteByReference(String reference) {
		return typeReviewDao.deleteByReference(reference);
	}

}
