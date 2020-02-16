package com.esercitazione.dao;

import java.util.List;

import com.esercitazione.dto.UserDto;

public interface UserDao {

	public List<UserDto> getAllUsers();
	public UserDto findUserById(int id);
	public UserDto save(UserDto user);
	public UserDto update(UserDto user);
	public UserDto elimina(int id);
	
}
