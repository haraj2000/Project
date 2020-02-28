package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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
	public TypeReview(long id, int nbrStars) {
		super();
		this.id = id;
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
