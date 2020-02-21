package com.project.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TypeReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int nbrStars;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNbrStars() {
		return nbrStars;
	}
	public void setNbrStars(int nbrStars) {
		this.nbrStars = nbrStars;
	}
	
	
}
