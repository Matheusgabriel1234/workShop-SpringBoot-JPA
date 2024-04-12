package com.matheusGabriel1234.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusGabriel1234.Project.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
