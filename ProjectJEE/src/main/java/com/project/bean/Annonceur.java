package com.project.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Annonceur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String login;
	private String password;
	private String first_name;
	private String Last_name;
	private String mail;
	private int phone_number;
	private String country;
	private String city;
	private String address;
	@ManyToOne
	private TypeAnnonceur typeAnnonceur;
	@OneToMany
	private List<AnnonceImmobilier> annonceImmobilier;
	@OneToMany
	private List<AnnonceVoiture> annonceVoiture;
	@OneToMany
	private List<Commentaire> commentaire;
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
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public TypeAnnonceur getTypeAnnonceur() {
		return typeAnnonceur;
	}
	public void setTypeAnnonceur(TypeAnnonceur typeAnnonceur) {
		this.typeAnnonceur = typeAnnonceur;
	}
	public List<AnnonceImmobilier> getAnnonceImmobilier() {
		return annonceImmobilier;
	}
	public void setAnnonceImmobilier(List<AnnonceImmobilier> annonceImmobilier) {
		this.annonceImmobilier = annonceImmobilier;
	}
	public List<AnnonceVoiture> getAnnonceVoiture() {
		return annonceVoiture;
	}
	public void setAnnonceVoiture(List<AnnonceVoiture> annonceVoiture) {
		this.annonceVoiture = annonceVoiture;
	}
	public List<Commentaire> getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(List<Commentaire> commentaire) {
		this.commentaire = commentaire;
	}
	
	public Annonceur(long id, String login, String password, String first_name, String last_name, String mail,
			int phone_number, String country, String city, String address, TypeAnnonceur typeAnnonceur,
			List<AnnonceImmobilier> annonceImmobilier, List<AnnonceVoiture> annonceVoiture,
			List<Commentaire> commentaire) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.first_name = first_name;
		Last_name = last_name;
		this.mail = mail;
		this.phone_number = phone_number;
		this.country = country;
		this.city = city;
		this.address = address;
		this.typeAnnonceur = typeAnnonceur;
		this.annonceImmobilier = annonceImmobilier;
		this.annonceVoiture = annonceVoiture;
		this.commentaire = commentaire;
	}
	
	public Annonceur() {
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
		Annonceur other = (Annonceur) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}