package com.esercitazione.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esercitazione.dao.AppointmentDao;
import com.esercitazione.dto.AppointmentDto;
import com.esercitazione.service.AppointmentService;

@Service
public class AppointmentServiceImplement implements AppointmentService {

	@Autowired
	AppointmentDao dao;
	
	@Override
	public List<AppointmentDto> getAllAppointment() {
		return dao.getAllAppointment();
	}

	@Override
	public AppointmentDto findAppointmentById(int id) {
		// TODO Auto-generated method stub
		return dao.findAppointmentById(id);
	}

	@Override
	public AppointmentDto save(AppointmentDto appointment) {
		// TODO Auto-generated method stub
		return dao.save(appointment);
	}

}
