package com.esercitazione.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esercitazione.dao.UserDao;
import com.esercitazione.dto.UserDto;
import com.esercitazione.service.UserService;
@Service
public class UserServiceImplement implements UserService {

	@Autowired
	UserDao dao;
	
	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public UserDto findUserById(int id) {
		// TODO Auto-generated method stub
		return dao.findUserById(id);
	}

	@Override
	public UserDto save(UserDto user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}
	
	public UserDto update(UserDto user) {
		// TODO Auto-generated method stub
		return dao.update(user);
	}

	@Override
	public UserDto elimina(int id) {
		// TODO Auto-generated method stub
		return dao.elimina(id);
	}

}
