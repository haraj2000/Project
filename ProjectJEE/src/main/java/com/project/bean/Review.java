package com.project.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String reference;
	@ManyToOne
	private TypeReview typeReview;
	private Date dateReview;
	@ManyToOne
	private Annonceur annonceur;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public TypeReview getTypeReview() {
		return typeReview;
	}
	public void setTypeReview(TypeReview typeReview) {
		this.typeReview = typeReview;
	}
	public Date getDateReview() {
		return dateReview;
	}
	public void setDateReview(Date dateReview) {
		this.dateReview = dateReview;
	}
	public Annonceur getAnnonceur() {
		return annonceur;
	}
	public void setAnnonceur(Annonceur annonceur) {
		this.annonceur = annonceur;
	}
	
	public Review(Long id, String reference, TypeReview typeReview, Date dateReview, Annonceur annonceur) {
		super();
		this.id = id;
		this.reference = reference;
		this.typeReview = typeReview;
		this.dateReview = dateReview;
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
	@Override
	public String toString() {
		return "Review [reference=" + reference + ", typeReview=" + typeReview + ", dateReview=" + dateReview
				+ ", annonceur=" + annonceur + "]";
	}
	
}
