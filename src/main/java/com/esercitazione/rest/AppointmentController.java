package com.esercitazione.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.esercitazione.dto.AppointmentDto;
import com.esercitazione.service.AppointmentService;


@RestController
@RequestMapping(value = "/api/appuntamento")
public class AppointmentController {

	@Autowired
	AppointmentService service;

	@RequestMapping(method =RequestMethod.POST,
			consumes =MediaType.APPLICATION_JSON_VALUE)
	public AppointmentDto insertAppointment(@RequestBody AppointmentDto appointment) {
		return service.save(appointment);
	}

	@RequestMapping(method = RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<AppointmentDto> getAllAppointment() {
		return service.getAllAppointment();
	}
}
