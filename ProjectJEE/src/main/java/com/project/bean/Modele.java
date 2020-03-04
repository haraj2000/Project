package com.project.bean;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Modele {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String version;
	private String nom;
	private int annee;
	
	@OneToMany(mappedBy = "modele")
	private List<Marque> marques;

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public List<Marque> getMarques() {
		return marques;
	}

	public void setMarques(List<Marque> marques) {
		this.marques = marques;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


	public Modele(String nom, int annee, String version) {
		super();
		this.nom = nom;
		this.annee = annee;
		this.version = version;
	}

	public Modele() {
		super();
		// TODO Auto-generated constructor stub
	}


}
