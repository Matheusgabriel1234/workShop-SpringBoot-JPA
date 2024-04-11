package com.matheusGabriel1234.Project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matheusGabriel1234.Project.entities.Users;
import com.matheusGabriel1234.Project.services.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserResources {

	@Autowired
	private UserServices serv;
	@GetMapping
	public ResponseEntity<List<Users>> findAll(){
		
		List<Users> users = serv.findAll();
		
		
		return ResponseEntity.ok().body(users);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Users> getId(@PathVariable Long id) {
		Users obj = serv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
