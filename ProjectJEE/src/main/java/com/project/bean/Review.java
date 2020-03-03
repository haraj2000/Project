package com.project.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	private TypeReview typeReview;
	@ManyToOne
	private Annonceur annonceur;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public TypeReview getTypeReview() {
		return typeReview;
	}
	public void setTypeReview(TypeReview typeReview) {
		this.typeReview = typeReview;
	}
	public Annonceur getAnnonceur() {
		return annonceur;
	}
	public void setAnnonceur(Annonceur annonceur) {
		this.annonceur = annonceur;
	}
	public Review(long id, TypeReview typeReview, Annonceur annonceur) {
		super();
		this.id = id;
		this.typeReview = typeReview;
		this.annonceur = annonceur;
	}
	public Review() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
