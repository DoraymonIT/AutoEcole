package com.example.stock.Bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class paimentDeEmploye {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double monatant;
	@Temporal(TemporalType.DATE)
	private Date date;
@ManyToOne
private Employe employe;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

public Double getMonatant() {
	return monatant;
}
public void setMonatant(Double monatant) {
	this.monatant = monatant;
}

public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

public paimentDeEmploye() {
	super();
	// TODO Auto-generated constructor stub
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public paimentDeEmploye(Long id, Double monatant, Date date, Employe employe) {
	super();
	this.id = id;
	this.monatant = monatant;
	this.date = date;
	this.employe = employe;
}
@Override
public String toString() {
	return "paimentDeEmploye [id=" + id + ", monatant=" + monatant + ", date=" + date + ", employe=" + employe + "]";
}




	}
