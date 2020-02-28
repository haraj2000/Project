package com.project.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AnnonceVoiture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String referance ;
	private Date date;
	private String descrp;
	private BigDecimal prix;
	private long kilometrage;
	private String couleur;	
	private Carburant carburant;	
	private Marque marque;
	private Transmission transmission;
	private Annonceur annonceur;
	private List<Commentaire> commentaires= new ArrayList<>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getReferance() {
		return referance;
	}
	public void setReferance(String referance) {
		this.referance = referance;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescrp() {
		return descrp;
	}
	public void setDescrp(String descrp) {
		this.descrp = descrp;
	}
	public BigDecimal getPrix() {
		return prix;
	}
	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
	public long getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(long kilometrage) {
		this.kilometrage = kilometrage;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Carburant getCarburant() {
		return carburant;
	}
	public void setCarburant(Carburant carburant) {
		this.carburant = carburant;
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public Transmission getTransmission() {
		return transmission;
	}
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}
	
	public Annonceur getAnnonceur() {
		return annonceur;
	}
	public void setAnnonceur(Annonceur annonceur) {
		this.annonceur = annonceur;
	}
	
	public List<Commentaire> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	@Override
	public String toString() {
		return "AnnonceVoiture [id=" + id + ", referance=" + referance + ", date=" + date + ", descrp=" + descrp
				+ ", prix=" + prix + ", kilometrage=" + kilometrage + ", couleur=" + couleur + ", carburant="
				+ carburant + ", marque=" + marque + ", transmission=" + transmission + ", annonceur=" + annonceur
				+ ", commentaires=" + commentaires + "]";
	}
	public AnnonceVoiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnnonceVoiture(Long id, String referance, Date date, String descrp, BigDecimal prix, long kilometrage,
			String couleur, Carburant carburant, Marque marque, Transmission transmission, Annonceur annonceur,
			List<Commentaire> commentaires) {
		super();
		this.id = id;
		this.referance = referance;
		this.date = date;
		this.descrp = descrp;
		this.prix = prix;
		this.kilometrage = kilometrage;
		this.couleur = couleur;
		this.carburant = carburant;
		this.marque = marque;
		this.transmission = transmission;
		this.annonceur = annonceur;
		this.commentaires = commentaires;
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
		AnnonceVoiture other = (AnnonceVoiture) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	

}
