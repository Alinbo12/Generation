package com.genspringboot.proyectospring.repository;

import org.springframework.data.repository.CrudRepository;

import com.genspringboot.proyectospring.model.User;

public interface UserRepository extends CrudRepository <User, Integer> {
    
}
