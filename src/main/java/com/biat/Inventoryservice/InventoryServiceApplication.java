package com.biat.inventoryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.biat.inventoryservice.model.Product;
import com.biat.inventoryservice.repository.ProductRepository;

@SpringBootApplication
public class InventoryServiceApplication implements CommandLineRunner {
@Autowired
ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		productRepository.save(new Product("iphone",180.0));
		productRepository.save(new Product("iphone",180.0));
		productRepository.save(new Product("iphone",180.0));
		productRepository.save(new Product("iphone",180.0));
		productRepository.save(new Product("iphone",180.0));
		productRepository.save(new Product("iphone",180.0));
		productRepository.findAll().forEach(System.out::println);
		
	}

}
