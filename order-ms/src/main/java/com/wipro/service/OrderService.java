package com.wipro.service;
import java.util.List;

import com.wipro.entity.Order;

public interface OrderService {

	void save(Order order);
	List<Order> findAll();
}