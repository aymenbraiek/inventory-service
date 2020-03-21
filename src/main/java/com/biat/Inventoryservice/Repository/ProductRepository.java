package com.biat.Inventoryservice.Repository;

import com.biat.Inventoryservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository  extends JpaRepository<Product,Long> {
}
