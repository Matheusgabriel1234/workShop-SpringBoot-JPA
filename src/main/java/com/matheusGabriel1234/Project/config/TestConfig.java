package com.matheusGabriel1234.Project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusGabriel1234.Project.entities.Category;
import com.matheusGabriel1234.Project.entities.Order;
import com.matheusGabriel1234.Project.entities.OrderItem;
import com.matheusGabriel1234.Project.entities.Product;
import com.matheusGabriel1234.Project.entities.Users;
import com.matheusGabriel1234.Project.entities.enums.OrderEnum;
import com.matheusGabriel1234.Project.repository.CategoryRepository;
import com.matheusGabriel1234.Project.repository.OrderItemRepository;
import com.matheusGabriel1234.Project.repository.OrderRepository;
import com.matheusGabriel1234.Project.repository.ProductRepository;
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
	
	@Autowired
	private ProductRepository prodRepo;
	
	@Autowired
	private OrderItemRepository orderItemrepo;

	@Override
	public void run(String... args) throws Exception {
		
		
		
Category c1 = new Category(null, "SmartPhones");
Category c2 = new Category(null, "Tablets");
Category c3 = new Category(null, "Notebooks");
		    
		
cateRepo.saveAll(Arrays.asList(c1, c2, c3));

Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

		
p2.getCategories().add(c2);
p2.getCategories().add(c1);
p3.getCategories().add(c3);
p4.getCategories().add(c2);
p5.getCategories().add(c1);
prodRepo.saveAll(Arrays.asList(p2, p3, p4, p5));




Users pedro = new Users(null,"Pedro Gabriel","pedro@111111.com","(11)11111-1111","pedro123");
 Users eduarda = new Users(null,"Eduarda Cecato","eduarda@111111.com","(11)11111-1111","eduarda123"); 
 
 Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderEnum.PAGO ,eduarda);
 Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderEnum.ENTREGUE,pedro);
 Order o3 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderEnum.ENTREGUE,pedro);
 
 repo.saveAll(Arrays.asList(pedro,eduarda));
 orderRepo.saveAll(Arrays.asList(o1,o2,o3));


 OrderItem oi1 = new OrderItem(o1, p2, 2, p2.getPrice()); 
 OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice()); 
 OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice()); 
 OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice()); 

 orderItemrepo.saveAll(Arrays.asList(oi1,oi2,oi3,oi4));
		
	}
	
}
