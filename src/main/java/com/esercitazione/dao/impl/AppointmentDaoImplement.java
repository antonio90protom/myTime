package com.esercitazione.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.esercitazione.dao.AppointmentDao;
import com.esercitazione.dto.AppointmentDto;

import com.esercitazione.entity.Appointment;



@Repository
public class AppointmentDaoImplement implements AppointmentDao {

	@PersistenceContext
	EntityManager em;
	
	@Autowired
    private ModelMapper modelMapper;
	
	public List<AppointmentDto> getAllAppointment() {
		CriteriaBuilder builder=em.getCriteriaBuilder();
		CriteriaQuery<AppointmentDto> query = builder.createQuery(AppointmentDto.class);
		Root<Appointment> root = query.from(Appointment.class);
		query.select(builder.construct(AppointmentDto.class, root.get("id"),root.get("testo"),root.get("allDay"),root.get("start"),root.get("utenteId")));
		TypedQuery<AppointmentDto> tq = em.createQuery(query);
		return tq.getResultList();
	}

	@Override
	public AppointmentDto findAppointmentById(int id) {
		CriteriaBuilder builder=em.getCriteriaBuilder();
		CriteriaQuery<AppointmentDto> query = builder.createQuery(AppointmentDto.class);
		Root<Appointment> root = query.from(Appointment.class);
		query.where(builder.equal(root.get("id"), id));
		query.select(builder.construct(AppointmentDto.class, root.get("id"),root.get("testo"),root.get("allDay"),root.get("start"),root.get("utenteId")));
		TypedQuery<AppointmentDto> tq = em.createQuery(query);
		return tq.getSingleResult();
	}

	@Override
	@Transactional
	public AppointmentDto save(AppointmentDto appointment) {
		em.persist(modelMapper.map(appointment, Appointment.class));
		return appointment;
	}

}
