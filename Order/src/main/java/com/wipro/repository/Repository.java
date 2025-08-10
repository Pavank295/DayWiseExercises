package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.entity.Order;

public interface Repository extends JpaRepository<Order, Integer> {}
