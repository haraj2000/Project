package com.project.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TypeReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int nbrStars;
}
