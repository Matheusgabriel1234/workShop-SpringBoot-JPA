package com.matheusGabriel1234.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusGabriel1234.Project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
