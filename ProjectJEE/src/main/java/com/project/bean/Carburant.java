package com.project.bean;

public class Carburant {
	private String energie;
	private Annonce annonce;
	
	public String getEnergie() {
		return energie;
	}
	public void setEnergie(String energie) {
		this.energie = energie;
	}
	public Annonce getAnnonce() {
		return annonce;
	}
	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}
	public Carburant(String energie, Annonce annonce) {
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
