package com.project.bean;

import java.util.Date;

import javax.persistence.ManyToOne;

public class AnnonceImmobilier {
	private long id;
	private String reference;
	private float prix;
	private float surface;
	private String titreAnnonce;
	private Date dateAnnonce;
	private String adresseImm;
	private String villeImm;
	@ManyToOne
	private Annonceur annonceur;
	@ManyToOne
	private TypeImmobilier typeImmobilier;
	
	public TypeImmobilier getTypeImmobilier() {
		return typeImmobilier;
	}
	public void setTypeImmobilier(TypeImmobilier typeImmobilier) {
		this.typeImmobilier = typeImmobilier;
	}
	public Annonceur getAnnonceur() {
		return annonceur;
	}
	public void setAnnonceur(Annonceur annonceur) {
		this.annonceur = annonceur;
	}
	public String getAdresseImm() {
		return adresseImm;
	}
	public void setAdresseImm(String adresseImm) {
		this.adresseImm = adresseImm;
	}
	public long getId() {
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
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public AnnonceImmobilier(long id, String reference, float prix, float surface, String titreAnnonce,
			Date dateAnnonce, String adresseImm, String villeImm, Annonceur annonceur, TypeImmobilier typeImmobilier) {
		super();
		this.id = id;
		this.reference = reference;
		this.prix = prix;
		this.surface = surface;
		this.titreAnnonce = titreAnnonce;
		this.dateAnnonce = dateAnnonce;
		this.adresseImm = adresseImm;
		this.villeImm = villeImm;
		this.annonceur = annonceur;
		this.typeImmobilier = typeImmobilier;
	}
	public AnnonceImmobilier() {
		super();
		// TODO Auto-generated constructor stub
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
		AnnonceImmobilier other = (AnnonceImmobilier) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	 

}
