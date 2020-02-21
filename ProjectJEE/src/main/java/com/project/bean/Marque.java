package com.project.bean;

public class Marque {
	private long id;
	private String nom;
	private Modele modele;
	private Annonce annonce;
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
	public Annonce getAnnonce() {
		return annonce;
	}
	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}
	public Marque(long id, String nom, Modele modele, Annonce annonce) {
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
	

}
