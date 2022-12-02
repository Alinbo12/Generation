package com.genspringboot.proyectospring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.genspringboot.proyectospring.model.BuySell;
import com.genspringboot.proyectospring.repository.BuySellRepository;


@Service
@Transactional
public class BuySellService {
    private BuySellRepository buySellRepository;

    public BuySellService(BuySellRepository buySellRepository){
        this.buySellRepository = buySellRepository;
    }

    public void saveBuySell(BuySell buysell){
        buySellRepository.save(buysell);
    }

    public void updateBuySell(BuySell buysell){
        buySellRepository.save(buysell);
    }

    public List<BuySell> findAllBuySell(){
        return buySellRepository.findAll();
    }

    public void eliminarBuySell(Integer id){
        buySellRepository.deleteById(id);
    }
}
