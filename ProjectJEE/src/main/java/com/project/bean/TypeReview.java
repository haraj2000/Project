package com.project.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String reference;
	private int nbrStars;
	@OneToMany(mappedBy = "typeReview")
	private List<Review> reviews;
	
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
	public int getNbrStars() {
		return nbrStars;
	}
	public void setNbrStars(int nbrStars) {
		this.nbrStars = nbrStars;
	}

	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public TypeReview(Long id, String reference, int nbrStars) {
		super();
		this.id = id;
		this.reference = reference;
		this.nbrStars = nbrStars;
	}
	public TypeReview() {
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
		TypeReview other = (TypeReview) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
