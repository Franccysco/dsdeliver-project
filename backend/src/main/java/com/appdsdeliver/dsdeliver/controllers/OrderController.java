package com.appdsdeliver.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdsdeliver.dsdeliver.dto.OrderDTO;
import com.appdsdeliver.dsdeliver.service.OrderSerive;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderSerive serivce;
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll(){
		List<OrderDTO> list = serivce.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
}
