package com.project.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Modele {
	private String version;
	private String nom;
	private int annee;
	
	@OneToMany(mappedBy ="Marque")
	private Marque marque;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Modele(String nom, int annee, String version, Marque marque) {
		super();
		this.nom = nom;
		this.annee = annee;
		this.version = version;
		this.marque = marque;
	}

	public Modele() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Modele [nom=" + nom + ", annee=" + annee + ", version=" + version + ", marque=" + marque + "]";
	}

}
