package com.matheusGabriel1234.Project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusGabriel1234.Project.entities.Product;
import com.matheusGabriel1234.Project.services.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductResource {

	@Autowired
	private ProductService serv;
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		
		List<Product> Product = serv.findAll();
		
		
		return ResponseEntity.ok().body(Product);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getId(@PathVariable Long id) {
		Product obj = serv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
