package com.sebastian.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private String numero;
	
	public Persona() {
		super();
	}
	
	public Persona(Long cedula,String nombre,String apellido,String correo,String numero){
		super();
		this.cedula=cedula;
		this.nombre=nombre;
		this.apellido=apellido;
		this.correo=correo;
		this.numero=numero;
	} 
	
	public Long getCedula() {
		return cedula;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getCorreo() {
		return correo;
	}
	public String getNumero() {
		return numero;
	}
	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
