package com.devsuperior.userdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdev.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
