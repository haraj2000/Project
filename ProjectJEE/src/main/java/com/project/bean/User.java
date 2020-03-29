package com.project.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String login;
	private String password;
	private String nom;
	@OneToOne
	private AnnonceImmobilier annonceImmobilier;
	@OneToOne
	private AnnonceVoiture annonceVoiture;
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
	public AnnonceImmobilier getAnnonceImmobilier() {
		return annonceImmobilier;
	}
	public void setAnnonceImmobilier(AnnonceImmobilier annonceImmobilier) {
		this.annonceImmobilier = annonceImmobilier;
	}
	public AnnonceVoiture getAnnonceVoiture() {
		return annonceVoiture;
	}
	public void setAnnonceVoiture(AnnonceVoiture annonceVoiture) {
		this.annonceVoiture = annonceVoiture;
	}
	public User(long id, String login, String password, String nom, AnnonceImmobilier annonceImmobilier,
			AnnonceVoiture annonceVoiture) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.annonceImmobilier = annonceImmobilier;
		this.annonceVoiture = annonceVoiture;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password + ", nom=" + nom
				+ ", annonceImmobilier=" + annonceImmobilier + ", annonceVoiture=" + annonceVoiture + "]";
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
