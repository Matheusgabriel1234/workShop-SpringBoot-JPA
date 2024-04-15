package com.matheusGabriel1234.Project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusGabriel1234.Project.entities.Product;
import com.matheusGabriel1234.Project.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> findAll() {
		return repo.findAll();
		
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repo.findById(id);
		return obj.get();
		 
		
	}
	
}
