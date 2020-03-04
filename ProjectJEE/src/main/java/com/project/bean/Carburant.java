package com.project.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Carburant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String libelle;
	private String energie;
	@OneToMany(mappedBy = "carburant")
	private List<AnnonceVoiture> annonceVoiture= new ArrayList<>();
	
	
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

	public List<AnnonceVoiture> getAnnonceVoiture() {
		return annonceVoiture;
	}
	public void setAnnonceVoiture(List<AnnonceVoiture> annonceVoiture) {
		this.annonceVoiture = annonceVoiture;
	}
	
	public Carburant(long id, String libelle, String energie, List<AnnonceVoiture> annonceVoiture) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.energie = energie;
		this.annonceVoiture = annonceVoiture;
	}
	public Carburant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLibelle() {
		return libelle;}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Carburant [id=" + id + ", energie=" + energie + ", annonceVoiture=" + annonceVoiture + "]";
	}
	

}
