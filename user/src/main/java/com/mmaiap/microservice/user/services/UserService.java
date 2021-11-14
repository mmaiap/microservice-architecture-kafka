package com.mmaiap.microservice.user.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmaiap.microservice.user.domain.User;
import com.mmaiap.microservice.user.repositories.UserRepository;
import com.mmaiap.microservice.user.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	
	public User find(Integer id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
	}

	public List<User> findAll() {
		return repo.findAll();
	}
	
	
}
