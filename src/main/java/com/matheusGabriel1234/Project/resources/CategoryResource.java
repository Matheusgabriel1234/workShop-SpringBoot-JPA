package com.matheusGabriel1234.Project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusGabriel1234.Project.entities.Category;
import com.matheusGabriel1234.Project.services.CategoryService;

@RestController
@RequestMapping(value="/categorys")
public class CategoryResource {

	@Autowired
	private CategoryService serv;
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> category = serv.findAll();
		
		
		return ResponseEntity.ok().body(category);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> getId(@PathVariable Long id) {
		Category obj = serv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
