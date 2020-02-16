package com.esercitazione.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.esercitazione.dto.UserDto;
import com.esercitazione.service.UserService;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {

		@Autowired
		UserService service;
		
		@RequestMapping(method = RequestMethod.GET)
		public ResponseEntity<List<UserDto>> getAllUsers() {
			return new ResponseEntity<List<UserDto>>(service.getAllUsers(), HttpStatus.OK);
		}
		
		@RequestMapping(method = RequestMethod.POST)
		public UserDto insertUser(@RequestBody UserDto user) {
			return service.save(user);
		}
		
		@RequestMapping(method = RequestMethod.GET,
				value = "/{id}")
		public UserDto searchUser(@PathVariable("id") int id) {
			return  service.findUserById(id);
			
		}
		
		@RequestMapping(method = RequestMethod.PATCH,value = "/{id}")
		public UserDto updateUser(@PathVariable("id") int id,@RequestBody UserDto user) {
			return service.update(user);
		}
		
		@RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
		public UserDto eliminaUser(@PathVariable("id") int id) {
			return service.elimina(id);
		}
	}


