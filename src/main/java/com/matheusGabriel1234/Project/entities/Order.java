package com.matheusGabriel1234.Project.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.matheusGabriel1234.Project.entities.enums.OrderEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	private Integer orderstatus;
	@ManyToOne
	@JoinColumn(name ="client_id")
	private Users client;
	
	
	@OneToMany(mappedBy = "id.order")
	private Set<OrderItem> item = new HashSet<OrderItem>();
	
	
	
	
	
	
	public Set<OrderItem> getItem() {
		return item;
	}
	
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
	

	public Instant getMoment() {
		return moment;
	}
	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	
	
	
	public OrderEnum getOrderstatus() {
		return OrderEnum.valueOf(orderstatus);
	}
	public void setOrderstatus(OrderEnum orderstatus) {
		if(orderstatus != null) {
		this.orderstatus = orderstatus.getCode();
		}
	}
	public Order() {
		
	}
	
	


	public Order(Long id, Instant moment, OrderEnum orderstatus, Users client) {
		super();
		this.id = id;
		this.moment = moment;
		setOrderstatus(orderstatus);
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
