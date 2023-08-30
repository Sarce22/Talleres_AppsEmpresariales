package com.sebastian.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long placa;
	private String cilindraje;
	private String color;
	private String puertas;
	private String marcas;
	private String tipo;
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(Long placa, String cilindraje, String color, String puertas, String marcas, String tipo) {
		super();
		this.placa = placa;
		this.cilindraje = cilindraje;
		this.color = color;
		this.puertas = puertas;
		this.marcas = marcas;
		this.tipo = tipo;
	}

	public Long getPlaca() {
		return placa;
	}

	public void setPlaca(Long placa) {
		this.placa = placa;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPuertas() {
		return puertas;
	}

	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}

	public String getMarcas() {
		return marcas;
	}

	public void setMarcas(String marcas) {
		this.marcas = marcas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
