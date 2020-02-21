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
	private long idType;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdType() {
		return idType;
	}
	public void setIdType(long idType) {
		this.idType = idType;
	}
	public String getIdAnnonceur() {
		return idAnnonceur;
	}
	public void setIdAnnonceur(String idAnnonceur) {
		this.idAnnonceur = idAnnonceur;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	private String idAnnonceur;
	private String comment;
}
