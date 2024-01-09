package com.gabrielreis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielreis.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
