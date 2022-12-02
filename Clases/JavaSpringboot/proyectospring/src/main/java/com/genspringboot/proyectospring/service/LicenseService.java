package com.genspringboot.proyectospring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.genspringboot.proyectospring.model.License;
import com.genspringboot.proyectospring.repository.LicenseRepository;

@Service
@Transactional
public class LicenseService {

    private LicenseRepository licenseRepository;

    public LicenseService(LicenseRepository licenseRepository){
        this.licenseRepository = licenseRepository;
    } 

    public void saveLicense(License license){
        licenseRepository.save(license);
    }

    public void updateLicense(License license){
        licenseRepository.save(license);
    }

    public List<License> findAll(){
        return licenseRepository.findAll();
    }

    public List<License> buscarClase(String clase){
        return licenseRepository.findAllclase(clase);
    }

    public List<License> buscarEstado(String estado){
        return licenseRepository.findAllEstado(estado);
    }

    public void eliminarLicencia(Integer id){
        licenseRepository.deleteById(id);
    }
}
