package com.project.bean;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Modele 
{
   private String nom;
   private Date annee;
   private String version;
   private Marque marque;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Date getAnnee() {
	return annee;
}
public void setAnnee(Date annee) {
	this.annee = annee;
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
public Modele(String nom, Date annee, String version, Marque marque) {
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
