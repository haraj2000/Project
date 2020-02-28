package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carburant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String energie;
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
		Carburant other = (Carburant) obj;
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
	public String getEnergie() {
		return energie;
	}
	public void setEnergie(String energie) {
		this.energie = energie;
	}
	public AnnonceVoiture getAnnonce() {
		return annonceVoiture;
	}
	public void setAnnonce(AnnonceVoiture annonceVoiture) {
		this.annonceVoiture = annonceVoiture;
	}
	
	public Carburant(long id, String energie, AnnonceVoiture annonceVoiture) {
		super();
		this.id = id;
		this.energie = energie;
		this.annonceVoiture = annonceVoiture;
	}
	public Carburant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Carburant [id=" + id + ", energie=" + energie + ", annonceVoiture=" + annonceVoiture + "]";
	}
	

}
