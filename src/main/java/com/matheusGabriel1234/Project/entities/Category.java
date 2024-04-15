package com.matheusGabriel1234.Project.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="tb_category")
public class Category implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@jakarta.persistence.Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;

@JsonIgnore
@ManyToMany(mappedBy = "categories")
private Set<Product> products = new HashSet<>();

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Set<Product> getProducts() {
	return products;
}
public void setProducts(Set<Product> products) {
	this.products = products;
}


public Category() {
	
}

public Category(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Category other = (Category) obj;
	return Objects.equals(id, other.id) && Objects.equals(name, other.name);
}






}
