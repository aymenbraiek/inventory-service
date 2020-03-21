package com.biat.Inventoryservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ToString
@Data
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private Double price;

    public Product(Long id,String name,Double price) {
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public Product() {
    }
}
