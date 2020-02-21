package com.project.bean;

import java.util.Date;

public class AnnonceImmobilier {
	private int id;
	private float prix;
	private float surface;
	private String titreAnnonce;
	private Date dateAnnonce;
	private String adresseImm;
	private String villeImm;
	public String getAdresseImm() {
		return adresseImm;
	}
	public void setAdresseImm(String adresseImm) {
		this.adresseImm = adresseImm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public float getSurface() {
		return surface;
	}
	public void setSurface(float surface) {
		this.surface = surface;
	}
	public String getTitreAnnonce() {
		return titreAnnonce;
	}
	public void setTitreAnnonce(String titreAnnonce) {
		this.titreAnnonce = titreAnnonce;
	}
	public Date getDateAnnonce() {
		return dateAnnonce;
	}
	public void setDateAnnonce(Date dateAnnonce) {
		this.dateAnnonce = dateAnnonce;
	}
	public String getVilleImm() {
		return villeImm;
	}
	public void setVilleImm(String villeImm) {
		this.villeImm = villeImm;
	}
	
	 

}
