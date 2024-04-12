package com.matheusGabriel1234.Project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusGabriel1234.Project.entities.Category;
import com.matheusGabriel1234.Project.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repo;
	
	public List<Category> findAll() {
		return repo.findAll();
		
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repo.findById(id);
		return obj.get();
		 
		
	}
	
}
