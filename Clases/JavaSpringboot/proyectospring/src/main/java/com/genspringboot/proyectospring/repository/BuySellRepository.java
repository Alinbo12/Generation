package com.genspringboot.proyectospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genspringboot.proyectospring.model.BuySell;

public interface BuySellRepository extends JpaRepository <BuySell, Integer> {
    
}
