package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Annonceur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String login;
	private String password;
	private String first_name;
	private String Last_name;
	private String mail;
	private int phone_number;
	private String country;
	private String city;
	private String address;
	@ManyToOne
	private TypeAnnonceur typeAnnonceur;
	@OneToMany
	private AnnonceImmobilier annonceImmobilier;
	@OneToMany
	private AnnonceVoiture annonceVoiture;
	@OneToMany
	private Commentaire commentaire;
}
