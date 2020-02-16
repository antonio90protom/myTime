package com.esercitazione.dao;

import java.util.List;
import com.esercitazione.dto.AppointmentDto;


public interface AppointmentDao {
	public List<AppointmentDto> getAllAppointment();
	public AppointmentDto findAppointmentById(int id);
	public AppointmentDto save(AppointmentDto appointment);
}
