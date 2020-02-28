package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Marque() {
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
		Marque other = (Marque) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
