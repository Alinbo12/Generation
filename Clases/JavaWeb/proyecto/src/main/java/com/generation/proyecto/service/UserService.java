package com.generation.proyecto.service;

// interfaz, similar a herencia pero más global

import java.util.List;

import com.generation.proyecto.model.User;

public interface UserService { 
    //cambiamos class por interface
    //crearemos funciones que pareciera no tener nada en común ni herencias, pero sí hay algo en común 
    // ejemplo: perro y camión -> no hay herencia pero se desplazan 
    // todas clases que estén asociadas usarán esta interfaz tal cual.

    /*  crearemos funciones que service array list y map tendrá: cuando las creemos, las clases que van a ocupar 
      esta interfaz tendrán las mismas funciones: por ejemplo getall   */

    List <User> getAll();  //  nos trae datos User del arraylist y hashMap

    void add(User user); // permite agregar usuario

    void remove (User user); //permite eliminar usuarios

    int size(); // nos trae tamañan de array o map

    User getUser (int position); // permite traer usuario según su posición


}
