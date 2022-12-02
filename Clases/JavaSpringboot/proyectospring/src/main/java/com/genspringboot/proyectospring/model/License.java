package com.genspringboot.proyectospring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "License")
public class License {
    @Id
    @GeneratedValue
    private Integer id;
    private int numero;
    //nos permite darle un formato predeterminado a la fehca en la base. Recomendable este formato porque todo está así.
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaVencimiento;
    private String clase;
    private String estado;

    //recepción de la relación 1 a 1 (desde user)
    @JsonManagedReference
    //acá recepcionamos (va a recibir una relación 1 a 1)
    @OneToOne(fetch = FetchType.EAGER)
    //columna de relación, dónde se van a unir. Columna FK
    @JoinColumn(name = "user_id")
    private User user;


    public License() {
    }


    public License(Integer id, int numero, Date fechaVencimiento, String clase, String estado) {
        this.id = id;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.clase = clase;
        this.estado = estado;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }


    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    public String getClase() {
        return clase;
    }


    public void setClase(String clase) {
        this.clase = clase;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
