package com.project.bean;

public class Transmission {
	private long id;
	private String libelle;
	private AnnonceVoiture annonce;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public AnnonceVoiture getAnnonce() {
		return annonce;
	}
	public void setAnnonce(AnnonceVoiture annonce) {
		this.annonce = annonce;
	}
	public Transmission(long id, String libelle, AnnonceVoiture annonce) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.annonce = annonce;
	}
	public Transmission() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Transmission [id=" + id + ", libelle=" + libelle + ", annonce=" + annonce + "]";
	}

	
	

}
