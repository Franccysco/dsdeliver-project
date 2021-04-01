package com.appdsdeliver.dsdeliver.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.appdsdeliver.dsdeliver.dto.OrderDTO;
import com.appdsdeliver.dsdeliver.entities.Order;
import com.appdsdeliver.dsdeliver.repositories.OrderRepository;

@Service
public class OrderSerive {

	@Autowired
	private OrderRepository repository;
	
	@Transactional
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrderWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
	
}
