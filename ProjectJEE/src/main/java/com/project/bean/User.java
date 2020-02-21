package com.project.bean;

import java.util.ArrayList;
import java.util.List;

public class User {
	private long id;
	private String login;
	private String password;
	private String nom;
	private AnnonceVoiture annonce;
	private List<Commentaire> commentaires= new ArrayList<>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public AnnonceVoiture getAnnonce() {
		return annonce;
	}
	public void setAnnonce(AnnonceVoiture annonce) {
		this.annonce = annonce;
	}
	public List<Commentaire> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	public User(long id, String login, String password, String nom, AnnonceVoiture annonce, List<Commentaire> commentaires) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.annonce = annonce;
		this.commentaires = commentaires;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password + ", nom=" + nom + ", annonce="
				+ annonce + ", commentaires=" + commentaires + "]";
	}
	
	

}
