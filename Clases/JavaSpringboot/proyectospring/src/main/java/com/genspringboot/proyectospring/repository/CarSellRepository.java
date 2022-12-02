package com.genspringboot.proyectospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genspringboot.proyectospring.model.CarSell;

// JPA para Listas - Crud para Iterables
public interface CarSellRepository extends JpaRepository <CarSell, Integer> {
    
}
