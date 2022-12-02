package com.genspringboot.proyectospring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.genspringboot.proyectospring.model.CarSell;
import com.genspringboot.proyectospring.model.License;

public interface LicenseRepository extends JpaRepository <CarSell, Integer>{
    
    //Este query es para encontrar la clase de la licencia
    @Query(value = "Select * from License where clase = ?1",nativeQuery = true)
    List<License> findAllclase(String clase);
    // Este query es para encontrar el estado de la licencia
    @Query(value = "Select * from License where estado = ?1",nativeQuery = true)
    List<License> findAllEstado(String estado);

    @Query(value = "SELECT * FROM license l JOIN l.user u", nativeQuery = true)
    List<License> BuscarLicenciasUsuarios();
}
