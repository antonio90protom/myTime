package com.esercitazione.service;

import java.util.List;
import com.esercitazione.dto.AppointmentDto;

public interface AppointmentService {

	public List<AppointmentDto> getAllAppointment();

	public AppointmentDto findAppointmentById(int id);

	public AppointmentDto save(AppointmentDto appointment);
}
