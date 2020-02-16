package com.esercitazione.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "appuntamento")
public class Appointment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8020194419583828431L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "testo")
	private String testo;
	
	@Column(name = "allDay")
	private boolean allDay;
	
	@Column(name = "start")
	private Date start;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "utenteId" )
	private User utenteId;

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

	public User getUtenteId() {
		return utenteId;
	}

	public void setUtenteId(User utenteId) {
		this.utenteId = utenteId;
	}

	
}
