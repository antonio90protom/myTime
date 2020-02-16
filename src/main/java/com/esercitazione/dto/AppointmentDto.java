package com.esercitazione.dto;

import java.util.Date;

import com.esercitazione.entity.User;


public class AppointmentDto {
	
	private int id;
	private String testo;
	private boolean allDay;
	private Date start;
	private Integer utenteId;
	
	

	public AppointmentDto(int id, String testo, boolean allDay, Date start, User utenteId) {
		this.id = id;
		this.testo = testo;
		this.allDay = allDay;
		this.start = start;
		this.utenteId = utenteId.getId();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public boolean getAllDay() {
		return allDay;
	}

	public void setAllDay(boolean luogo) {
		this.allDay = luogo;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Integer getUtenteId() {
		return utenteId;
	}

	public void setUtenteId(Integer utenteId) {
		this.utenteId = utenteId;
	}

	

}
