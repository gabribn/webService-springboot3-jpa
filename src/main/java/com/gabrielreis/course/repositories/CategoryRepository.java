package com.gabrielreis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielreis.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
