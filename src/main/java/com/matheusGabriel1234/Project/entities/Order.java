package com.matheusGabriel1234.Project.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="tb_order")
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant moment;
	
	
	
	
	public Instant getMoment() {
		return moment;
	}
	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name ="client_id")
	private Users client;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Users getClient() {
		return client;
	}
	public void setClient(Users client) {
		this.client = client;
	}
	
	public Order() {
		
	}
	
	

	public Order(Long id, Instant moment, Users client) {
		super();
		this.id = id;
		this.moment = moment;
		this.client = client;
	}
	@Override
	public int hashCode() {
		return Objects.hash(client, id, moment);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(client, other.client) && Objects.equals(id, other.id)
				&& Objects.equals(moment, other.moment);
	} 
	
	

	
}
