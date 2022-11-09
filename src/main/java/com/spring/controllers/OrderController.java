package com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.services.OrderService;
import com.spring.wrapper.OrderWrapper;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderservice=null;
	
	@PostMapping("/save")
	public void saveOrder(@RequestBody OrderWrapper wrapper) {
		orderservice.saveOrder(wrapper);
		System.out.println(wrapper.toString());
	}

}
