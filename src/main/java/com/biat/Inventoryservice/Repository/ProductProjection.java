package com.biat.inventoryservice.repository;

import org.springframework.data.rest.core.config.Projection;

import com.biat.inventoryservice.model.Product;

@Projection(name="p2",types = Product.class)
public interface ProductProjection {
	
	String getName();
	Double getPrice();
	

}
