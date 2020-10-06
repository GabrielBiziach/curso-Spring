package com.gabrielbiziach.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielbiziach.cursoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
