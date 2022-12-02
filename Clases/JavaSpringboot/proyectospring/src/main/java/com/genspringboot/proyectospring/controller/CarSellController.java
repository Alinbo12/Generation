package com.genspringboot.proyectospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.proyectospring.model.CarSell;
import com.genspringboot.proyectospring.service.CarSellService;

@CrossOrigin("*")
@RestController
public class CarSellController {
    
    private CarSellService carSellService;

    public CarSellController(@Autowired CarSellService carSellService){
        this.carSellService = carSellService;
    }

    @PostMapping("/CarSell/save")
    public void guardarLicense(@RequestBody CarSell carSell){
        carSellService.saveCarSell(carSell);    
    }

    @PutMapping("/CarSell/update")
    public void updateLicense(@RequestBody CarSell carSell){
        carSellService.saveCarSell(carSell);
    }

    @GetMapping("/License/findAll")
    public List<CarSell> todasLasLicencias(){
        return carSellService.findAllCarSell();
    }
    @DeleteMapping()
    public void eliminarCarSell(@PathVariable Integer id){
        carSellService.eliminarCarSell(id);
    }
}
