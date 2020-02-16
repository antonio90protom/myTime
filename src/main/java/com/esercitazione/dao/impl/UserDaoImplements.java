package com.esercitazione.dao.impl;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.esercitazione.dao.UserDao;
import com.esercitazione.dto.UserDto;
import com.esercitazione.entity.User;

@Repository
public class UserDaoImplements implements UserDao {

	@PersistenceContext
	EntityManager em;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<UserDto> getAllUsers() {
		CriteriaBuilder criteria = em.getCriteriaBuilder();
		CriteriaQuery<UserDto> query = criteria.createQuery(UserDto.class);
		Root<User> root = query.from(User.class);
		query.select(criteria.construct(UserDto.class, root.get("id"), root.get("nome"),root.get("cognome"),root.get("telefono")));
		TypedQuery<UserDto> result = em.createQuery(query);
		return result.getResultList();
	}

	@Override
	public UserDto findUserById(int id) {
		CriteriaBuilder criteria = em.getCriteriaBuilder();
		CriteriaQuery<UserDto> query = criteria.createQuery(UserDto.class);
		Root<User> root = query.from(User.class);
		query.where(criteria.equal(root.get("id"), id));
		query.select(criteria.construct(UserDto.class, root.get("id"), root.get("nome"),root.get("cognome"),root.get("telefono")));
		TypedQuery<UserDto> result = em.createQuery(query);
		return result.getSingleResult();
	}

	@Override
	@Transactional
	public UserDto save(UserDto user) {
		em.persist(modelMapper.map(user, User.class));
		return user;
	}
	
	@Transactional
	public UserDto update(UserDto user) {
		em.merge(modelMapper.map(user, User.class));
		return user;
	}

	@Override
	@Transactional
	public UserDto elimina(int id) {
		User user = em.find(User.class, id);
		em.remove(user);
		return modelMapper.map(user, UserDto.class);
	}


}
