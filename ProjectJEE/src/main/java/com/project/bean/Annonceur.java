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
	private Long id;
	private String mail;
	private String password;
	private String firstName; // la ilaha ila lah 
	private String lastName;
	private int phoneNumber;
	private String city;
	private String address;
	@ManyToOne
	private TypeAnnonceur typeAnnonceur;

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phone_number) {
		this.phoneNumber = phone_number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public TypeAnnonceur getTypeAnnonceur() {
		return typeAnnonceur;
	}
	public void setTypeAnnonceur(TypeAnnonceur typeAnnonceur) {
		this.typeAnnonceur = typeAnnonceur;
	}
	
	public Annonceur(Long id, String mail, String password, String firstName, String lastName, int phoneNumber, String city, String address, TypeAnnonceur typeAnnonceur) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.address = address;
		this.typeAnnonceur = typeAnnonceur;
	}
	public Annonceur() {
		super();
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
		Annonceur other = (Annonceur) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Annonceur [mail=" + mail + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phoneNumber=" + phoneNumber + ", city=" + city + ", address="
				+ address + ", typeAnnonceur=" + typeAnnonceur + "]";
	}
	
	
}
