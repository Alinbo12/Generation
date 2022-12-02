package com.genspringboot.proyectospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.proyectospring.model.License;
import com.genspringboot.proyectospring.service.LicenseService;


@CrossOrigin("*")
@RestController
public class LicenseController {

    private LicenseService licenseService;

    public LicenseController (@Autowired LicenseService licenseService){
        this.licenseService = licenseService;
    }
    
    @PostMapping("License/save")
    public void guardarLicense(@RequestBody License license){
        licenseService.saveLicense(license);
    }


    @PutMapping("/License/update")
    public void updateLicense(@RequestBody License license){
        licenseService.saveLicense(license);
    }

    @GetMapping("/License/findAll")
    public List<License> todasLasLicencias(){
        return licenseService.findAll();
    }

    @GetMapping("/License/buscarClase")
    public List<License> buscarClase(String clase){
        return licenseService.buscarClase(clase);
    }

}
