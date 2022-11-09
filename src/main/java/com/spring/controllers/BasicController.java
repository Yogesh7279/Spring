package com.spring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.beans.Product;

@RestController
@RequestMapping("/product")
public class BasicController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping("info")
	public Product getProduct() {
		Product product = new Product();
		product.setId(1);
		product.setName("TV");
		return product;
	}
	
	@PostMapping("/add")
	public String addProduct(@RequestBody Product product) {
		return "Product id is " + product.getId() + " and product price is " + product.getName();	
	}
	
	@GetMapping("/response")
	public ResponseEntity<Product> getResponse(){
		Product product = new Product();
		product.setId(3);
		product.setName("Monitor");
		return new ResponseEntity<Product>(product,HttpStatus.ALREADY_REPORTED);
	}

}