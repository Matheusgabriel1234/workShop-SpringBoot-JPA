package com.matheusGabriel1234.Project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusGabriel1234.Project.entities.Users;
import com.matheusGabriel1234.Project.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository repo;

	@Override
	public void run(String... args) throws Exception {
 Users pedro = new Users(null,"Pedro Gabriel","pedro@111111.com","(11)11111-1111","pedro123");
 Users eduarda = new Users(null,"Eduarda Cecato","eduarda@111111.com","(11)11111-1111","eduarda123"); 
 
 repo.saveAll(Arrays.asList(pedro,eduarda));
		
	}
	
}
