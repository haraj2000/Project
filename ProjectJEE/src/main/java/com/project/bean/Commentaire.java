package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commentaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private User user;
	private AnnonceVoiture annonce;
	private String message;
	
	
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
		Commentaire other = (Commentaire) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
