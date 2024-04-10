package com.matheusGabriel1234.Project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusGabriel1234.Project.entities.Users;

@RestController
@RequestMapping(value="/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<Users> findAll(){
		Users u = new Users(1L, "Matheus Gabriel", "matheus@11111", "11-999999999","roma123");
		return ResponseEntity.ok().body(u);
	}
}
