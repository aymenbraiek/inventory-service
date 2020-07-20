package com.biat.inventoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biat.inventoryservice.model.Product;
import com.biat.inventoryservice.repository.ProductRepository;

@RestController
@RequestMapping("/biat")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	
	
	@GetMapping("/listproducts")
	List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}

}
