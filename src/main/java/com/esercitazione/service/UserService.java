package com.esercitazione.service;

import java.util.List;

import com.esercitazione.dto.UserDto;

public interface UserService {
	public List<UserDto> getAllUsers();

	public UserDto findUserById(int id);
	
	public UserDto save(UserDto user);
	
	public UserDto update(UserDto user);
	
	public UserDto elimina(int id);
	
}
