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

import com.genspringboot.proyectospring.model.BuySell;
import com.genspringboot.proyectospring.service.BuySellService;

@CrossOrigin("*")
@RestController
public class BuySellController {
    
    private BuySellService buySellService;

    public BuySellController(@Autowired BuySellService buySellService){
        this.buySellService = buySellService;
    }

    @PostMapping("/BuySell/save")
    public void guardarLicense(@RequestBody BuySell buysell){
        buySellService.saveBuySell(buysell);    
    }

    @PutMapping("/BuySell/update")
    public void updateLicense(@RequestBody BuySell buysell){
        buySellService.saveBuySell(buysell);
    }

    @GetMapping("/BuySell/findAll")
    public List<BuySell> findAllBuySell(){
        return buySellService.findAllBuySell();
    }

    @DeleteMapping("/BuySell/delete/{id}")
        public void eliminarBuySell(@PathVariable Integer id){
            buySellService.eliminarBuySell(id);
        }
}
