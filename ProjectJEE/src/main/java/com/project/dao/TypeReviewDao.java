package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bean.TypeReview;

@Repository
public interface TypeReviewDao extends JpaRepository<TypeReview, Long> {
	

}
