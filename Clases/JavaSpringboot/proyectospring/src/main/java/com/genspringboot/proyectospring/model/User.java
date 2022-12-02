package com.genspringboot.proyectospring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

//declaramos entidad. Puede tener cualquier nombre, pero se recomineda que se llame igual que la clase.
@Entity(name = "user") // le da el nombre en nuestra table en la BB.DD.
public class User {
     //creación de PK ID
     @Id
     @GeneratedValue
     private int id;
     private String nombre;
     @Column(name="last_name") //se le cambia el nombre de la columna al atributo de abajo
     private String Apellido;
      //hago que el correo sea unico, no se puede repetir
     @Column(unique = true)
      private String Correo;

     
    // creamo relación uno a uno (one to one)
    //referencia a JSON
    @JsonBackReference
    //relación (cual mapeamos qué tabla usamos, de qué manera (primero una relación, luego otra),
    // nos permite darle al atributo de cómo lo vamos a interconectar: Lazy para relación 1 a 1 ; Iger 1 a muchos)
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY) //--> siempre va en relación 1 a 1
    //indicamos con qué lo unimos
    private License license;



    //Creamos relación one to many 
    @JsonBackReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List <BuySell> BuySell;


    public User() {
    }


    public User(int id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        Apellido = apellido;
        Correo = correo;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return Apellido;
    }


    public void setApellido(String apellido) {
        Apellido = apellido;
    }


    public String getCorreo() {
        return Correo;
    }


    public void setCorreo(String correo) {
        Correo = correo;
    }

    

}
