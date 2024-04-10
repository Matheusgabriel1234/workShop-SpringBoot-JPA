package com.matheusGabriel1234.Project.entities;

import java.io.Serializable;
import java.util.Objects;

public class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String email;
	private String telephone;
	private String password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Users() {
		
	}
	public Users(Long id, String name, String email, String telephone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, password, telephone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(telephone, other.telephone);
	}
	

	

}
