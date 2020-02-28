package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private Modele modele;
	private AnnonceVoiture annonce;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Modele getModele() {
		return modele;
	}
	public void setModele(Modele modele) {
		this.modele = modele;
	}
	public AnnonceVoiture getAnnonce() {
		return annonce;
	}
	public void setAnnonce(AnnonceVoiture annonce) {
		this.annonce = annonce;
	}
	public Marque(long id, String nom, Modele modele, AnnonceVoiture annonce) {
		super();
		this.id = id;
		this.nom = nom;
		this.modele = modele;
		this.annonce = annonce;
	}
	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Marque [id=" + id + ", nom=" + nom + ", modele=" + modele + ", annonce=" + annonce + "]";
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
		Marque other = (Marque) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
