package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Transmission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
    @OneToOne
	private AnnonceVoiture annonceVoiture;
	
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
		Transmission other = (Transmission) obj;
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
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public AnnonceVoiture getAnnonce() {
		return annonceVoiture;
	}
	public void setAnnonce(AnnonceVoiture annonceVoiture) {
		this.annonceVoiture = annonceVoiture;
	}
	public Transmission(long id, String libelle, AnnonceVoiture annonceVoiture) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.annonceVoiture = annonceVoiture;
	}
	public Transmission() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Transmission [id=" + id + ", libelle=" + libelle + ", annonceVoiture=" + annonceVoiture + "]";
	}
	
	
	

}
