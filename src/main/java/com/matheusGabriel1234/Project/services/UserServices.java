package com.matheusGabriel1234.Project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusGabriel1234.Project.entities.Users;
import com.matheusGabriel1234.Project.repository.UserRepository;

@Service

public class UserServices {

	
	@Autowired
	private UserRepository repo;
	
	public List<Users> findAll(){
		return repo.findAll();
		
	}
	
	public Users findById(Long id) {
		Optional<Users> obj = repo.findById(id);
		return obj.get();
		 
		
	}
	
	public Users insert(Users obj) {
		return repo.save(obj);
	}
	
	public void delete(Long id) {
		findById(id);
		repo.deleteById(id);
		
	}
	
	public Users update(Users obj) {
		Users newobj = repo.findById(obj.getId()).orElse(obj);
		updateData(newobj,obj);
		return repo.save(newobj);
		
		
	}
	
	private void updateData(Users newObj,Users obj) {
		newObj.setEmail(obj.getEmail());
		newObj.setId(obj.getId());
		newObj.setName(obj.getName());
		newObj.setOrders(obj.getOrders());
		newObj.setTelephone(obj.getTelephone());
        newObj.setPassword(obj.getPassword());
	}
}
