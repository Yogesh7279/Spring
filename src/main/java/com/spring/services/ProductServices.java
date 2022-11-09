package com.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.beans.Product;
import com.spring.repository.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository productRepository = null;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}
	
	public List<Product> getAll(){
		return productRepository.findAll();
	}
	
	public List<Product> saveAll(List<Product> product){
		return productRepository.saveAll(product);
	}
}
