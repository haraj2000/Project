package com.project.bean;

import javax.persistence.Entity;

@Entity

public class Commentaire {
	private User user;
	private AnnonceVoiture annonce;
	private String message;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public AnnonceVoiture getAnnonce() {
		return annonce;
	}
	public void setAnnonce(AnnonceVoiture annonce) {
		this.annonce = annonce;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Commentaire(User user, AnnonceVoiture annonce, String message) {
		super();
		this.user = user;
		this.annonce = annonce;
		this.message = message;
	}
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Commentaire [user=" + user + ", annonce=" + annonce + ", message=" + message + "]";
	}
	
	

}
