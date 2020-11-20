package com.esprit.microservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String service;
	private Boolean etat;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}

	public Job(String service, Boolean etat) {
		super();
		this.service = service;
		this.etat = etat;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	public int getId() {
		return id;
	}
	
}
