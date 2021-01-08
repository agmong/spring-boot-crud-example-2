package com.java.example.repository;

import com.java.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
