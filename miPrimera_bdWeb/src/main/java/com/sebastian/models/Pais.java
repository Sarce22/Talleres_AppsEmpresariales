package com.sebastian.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long poblacion;
	private String nombre;
	private String capital;
	private String continente;
	
	public Pais() {
		super();
	}
	
	public Pais(Long poblacion, String nombre, String capital, String continente) {
		super();
		this.poblacion = poblacion;
		this.nombre = nombre;
		this.capital = capital;
		this.continente = continente;
	}
	public Long getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(Long poblacion) {
		this.poblacion = poblacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	
	
}
