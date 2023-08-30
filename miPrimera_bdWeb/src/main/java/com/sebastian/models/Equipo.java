package com.sebastian.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Equipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id_equipo;
	private String nombre;
	private String pais;
	private String liga;
	private Date anio;
	private String entrenador;
	private String nombre_estadio;
	
	public Equipo() {
		super();
	}
	
	
	public Equipo(Long id_equipo, String nombre, String pais, String liga, Date anio, String entrenador,
			String nombre_estadio) {
		super();
		this.id_equipo = id_equipo;
		this.nombre = nombre;
		this.pais = pais;
		this.liga = liga;
		this.anio = anio;
		this.entrenador = entrenador;
		this.nombre_estadio = nombre_estadio;
	}
	public Long getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(Long id_equipo) {
		this.id_equipo = id_equipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getLiga() {
		return liga;
	}
	public void setLiga(String liga) {
		this.liga = liga;
	}
	public Date getAnio() {
		return anio;
	}
	public void setAnio(Date anio) {
		this.anio = anio;
	}
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public String getNombre_estadio() {
		return nombre_estadio;
	}
	public void setNombre_estadio(String nombre_estadio) {
		this.nombre_estadio = nombre_estadio;
	}
	
	
}
