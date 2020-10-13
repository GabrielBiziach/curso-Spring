package com.gabrielbiziach.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielbiziach.cursoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
