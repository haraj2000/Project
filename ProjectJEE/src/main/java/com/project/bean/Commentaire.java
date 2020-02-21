package com.project.bean;

public class Commentaire {
	private User user;
	private Annonce annonce;
	private String message;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Annonce getAnnonce() {
		return annonce;
	}
	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Commentaire(User user, Annonce annonce, String message) {
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
