package com.esercitazione.dto;

import java.util.Set;



public class UserDto {

	private int id;
	private String nome;
	private String cognome;
	private String telefono;
	private Set<Integer> appointments;
	
	
	public UserDto() {
	}
	
	public UserDto(int id, String nome, String cognome, String telefono) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Set<Integer> getAppointments() {
		return appointments;
	}
	
	public void setAppointments(Set<Integer> appointments) {
		this.appointments = appointments;
	}

}
