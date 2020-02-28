package com.project.bean;

import javax.persistence.Entity;
@Entity

public class Carburant {
	
    private long id;
	private String energie;
	private AnnonceVoiture annonce;
	
	
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
		return annonce;
	}
	public void setAnnonce(AnnonceVoiture annonce) {
		this.annonce = annonce;
	}
	public Carburant(String energie, AnnonceVoiture annonce) {
		super();
		this.energie = energie;
		this.annonce = annonce;
	}
	public Carburant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Carburant [energie=" + energie + ", annonce=" + annonce + "]";
	}


}
