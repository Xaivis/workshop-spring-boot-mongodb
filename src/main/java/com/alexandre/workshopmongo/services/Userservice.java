package com.alexandre.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.workshopmongo.domain.User;
import com.alexandre.workshopmongo.repositories.UserRepository;

@Service
public class Userservice {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
