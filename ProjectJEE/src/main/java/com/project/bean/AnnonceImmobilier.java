package com.project.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AnnonceImmobilier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	@OneToMany(mappedBy = "annonceImmobilier")
	private List<Commentaire> commentaires;
	
	public TypeImmobilier getTypeImmobilier() {
		return typeImmobilier;
	}
	public void setTypeImmobilier(TypeImmobilier typeImmobilier) {
		this.typeImmobilier = typeImmobilier;
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
	
	public Annonceur getAnnonceur() {
		return annonceur;
	}
	public void setAnnonceur(Annonceur annonceur) {
		this.annonceur = annonceur;
	}
	public List<Commentaire> getCommantaires() {
		return commentaires;
	}
	public void setCommantaires(List<Commentaire> commantaires) {
		this.commentaires = commantaires;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Commentaire> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	public AnnonceImmobilier(long id, String reference, float prix, float surface, String titreAnnonce,
			Date dateAnnonce, String adresseImm, String villeImm, Annonceur annonceur, TypeImmobilier typeImmobilier,
			List<Commentaire> commentaires) {
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
		this.commentaires = commentaires;
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
