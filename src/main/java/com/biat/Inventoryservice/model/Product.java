package com.biat.inventoryservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 889002785639383788L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private  String name;
	    private Double price;
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
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Product(String name, Double price) {
			super();
			this.name = name;
			this.price = price;
		}

	

}
