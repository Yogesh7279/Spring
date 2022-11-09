package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.beans.Product;
import com.spring.services.ProductServices;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductServices productServices = null;
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return productServices.saveProduct(product);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productServices.updateProduct(product);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		productServices.deleteProduct(id);
		return "Product deleted successfully";
	}
	
	@GetMapping("all")
	public List<Product> allProducts(){
		return productServices.getAll();
	}
	
	@PostMapping("saveall")
	public String saveProducts(@RequestBody List<Product> product) {
		productServices.saveAll(product);
		return "All products saved";	
	}

}
