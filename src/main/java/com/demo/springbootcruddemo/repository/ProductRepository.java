package com.demo.springbootcruddemo.repository;

import com.demo.springbootcruddemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
