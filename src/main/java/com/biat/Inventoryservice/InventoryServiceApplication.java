package com.biat.Inventoryservice;

import com.biat.Inventoryservice.Repository.ProductRepository;
import com.biat.Inventoryservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryServiceApplication implements CommandLineRunner {
 @Autowired
	ProductRepository productRepository;
 @Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Product.class);
		productRepository.save(new Product(null,"x20",102.2));
		productRepository.save(new Product(null,"x29",108.2));
		productRepository.save(new Product(null,"x222",105.2));
		productRepository.save(new Product(null,"x20666",103.2));
		productRepository.findAll().forEach(System.out::println);

	}
}
