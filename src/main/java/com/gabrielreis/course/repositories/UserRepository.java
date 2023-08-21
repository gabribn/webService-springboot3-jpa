package com.gabrielreis.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielreis.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
