package com.alexandre.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.workshopmongo.domain.User;
import com.alexandre.workshopmongo.repositories.UserRepository;
import com.alexandre.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class Userservice {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(
			() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
