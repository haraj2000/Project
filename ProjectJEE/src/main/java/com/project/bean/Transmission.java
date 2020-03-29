package com.project.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Transmission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
    @OneToMany(mappedBy = "transmission")
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
		Transmission other = (Transmission) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<AnnonceVoiture> getAnnonceVoiture() {
		return annonceVoiture;
	}
	public void setAnnonceVoiture(List<AnnonceVoiture> annonceVoiture) {
		this.annonceVoiture = annonceVoiture;
	}
	
	public Transmission(long id, String libelle, List<AnnonceVoiture> annonceVoiture) {
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
