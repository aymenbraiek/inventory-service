package com.biat.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.biat.inventoryservice.model.Product;
@RepositoryRestController
public interface ProductRepository extends JpaRepository<Product, Long>{

}
