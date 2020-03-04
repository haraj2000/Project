package com.project.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne
	private Annonceur annonceur;
	@ManyToOne
	private AnnonceVoiture annonceVoiture; 
	@ManyToOne
	private AnnonceImmobilier annonceImmobilier;
	private String message;
	private String titre;
	
	private Date dateCommentaire;	
		
	public Date getDateCommentaire() {
		return dateCommentaire;
	}
	public void setDateCommentaire(Date dateCommentaire) {
		this.dateCommentaire = dateCommentaire;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
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
	public Annonceur getAnnonceur() {
		return annonceur;
	}
	public void setAnnonceur(Annonceur annonceur) {
		this.annonceur = annonceur;
	}
	public AnnonceVoiture getAnnonceVoiture() {
		return annonceVoiture;
	}
	public void setAnnonceVoiture(AnnonceVoiture annonceVoiture) {
		this.annonceVoiture = annonceVoiture;
	}
	public AnnonceImmobilier getAnnonceImmobilier() {
		return annonceImmobilier;
	}
	public void setAnnonceImmobilier(AnnonceImmobilier annonceImmobilier) {
		this.annonceImmobilier = annonceImmobilier;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Commentaire [id=" + id + ", annonceur=" + annonceur + ", annonceVoiture=" + annonceVoiture
				+ ", annonceImmobilier=" + annonceImmobilier + ", message=" + message + ", titre=" + titre
				+ ", dateCommentaire=" + dateCommentaire + "]";
	}
	
	
	
	

}
