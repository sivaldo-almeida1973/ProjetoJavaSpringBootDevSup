package com.devsuperior.userdev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdev.entities.User;
import com.devsuperior.userdev.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	//atributo
	@Autowired
	private UserRepository repository;
	
	
	//metodo
	@GetMapping
	public List<User> findAll() {
		List<User> result =  repository.findAll();
		return result;
	}
	
	//metodo busca por id
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User result =  repository.findById(id).get();
		return result;
	}
	
	//metodo salvar novo usuario
	@PostMapping
	public User insert(@RequestBody User user) {
		User result =  repository.save(user);
		return result;
	}

	
	

}
