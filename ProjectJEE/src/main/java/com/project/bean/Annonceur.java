package com.project.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Annonceur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	private long idType;
	private String lastName;
	private String firstName;
	private String email;
	private String address;
	private String city;
	private String region;
	private String country;
	private String sex;
	private String userName;
	private String password;

}
