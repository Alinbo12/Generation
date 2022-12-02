package com.genespringboot.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


//declaramos entidad. Puede tener cualquier nombre, pero se recomineda que se llame igual que la clase.
@Entity(name = "User") // le da el nombre en nuestra table en la BB.DD.

public class User implements User {
    //creación de PK ID
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    @Column(name="last_name") //se le cambia el nombre de la columna al atributo de abajo
    private String Apellido;
    private String Correo;


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
