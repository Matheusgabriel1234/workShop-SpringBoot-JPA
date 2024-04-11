package com.matheusGabriel1234.Project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusGabriel1234.Project.entities.Order;
import com.matheusGabriel1234.Project.services.OrderService;

@RestController
@RequestMapping(value="/orders")
public class OrderResource {

	@Autowired
	private OrderService serv;
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		
		List<Order> order = serv.findAll();
		
		
		return ResponseEntity.ok().body(order);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> getId(@PathVariable Long id) {
		Order obj = serv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
