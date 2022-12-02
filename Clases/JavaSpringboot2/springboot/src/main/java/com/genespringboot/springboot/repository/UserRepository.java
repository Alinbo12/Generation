package com.genespringboot.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.genespringboot.springboot.model.User;

public interface UserRepository extends CrudRepository <User, Integer> { //también será una interfaz y tendrá el CRUD de manera automática
    
}
