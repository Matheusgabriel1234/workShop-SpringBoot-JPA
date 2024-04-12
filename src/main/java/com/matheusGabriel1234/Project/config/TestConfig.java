package com.matheusGabriel1234.Project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusGabriel1234.Project.entities.Category;
import com.matheusGabriel1234.Project.entities.Order;
import com.matheusGabriel1234.Project.entities.Users;
import com.matheusGabriel1234.Project.entities.enums.OrderEnum;
import com.matheusGabriel1234.Project.repository.CategoryRepository;
import com.matheusGabriel1234.Project.repository.OrderRepository;
import com.matheusGabriel1234.Project.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private OrderRepository orderRepo;

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private CategoryRepository cateRepo;

	@Override
	public void run(String... args) throws Exception {
 Users pedro = new Users(null,"Pedro Gabriel","pedro@111111.com","(11)11111-1111","pedro123");
 Users eduarda = new Users(null,"Eduarda Cecato","eduarda@111111.com","(11)11111-1111","eduarda123"); 
 
 Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderEnum.PAGO ,eduarda);
 Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderEnum.ENTREGUE,pedro);
 Order o3 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderEnum.ENTREGUE,pedro);
 
 Category c1 = new Category(null,"SmartPhones");
 Category c2 = new Category(null,"Tablets");
 

 
 repo.saveAll(Arrays.asList(pedro,eduarda));
 orderRepo.saveAll(Arrays.asList(o1,o2,o3));
cateRepo.saveAll(Arrays.asList(c1,c2));
		
	}
	
}
