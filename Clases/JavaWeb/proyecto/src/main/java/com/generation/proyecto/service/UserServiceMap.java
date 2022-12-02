package com.generation.proyecto.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.generation.proyecto.model.User;

@Service
@Primary
public class UserServiceMap implements UserService{ // añadimos la implemnetación de interfaz
    // ahora toca crear las 5 funciones en HashMap

    private Map <Integer, User> userMap = new HashMap<>();


    @Override
      public List <User> getAll(){
       //Aqui estoy creando una colleccion
        Collection <User> valor = userMap.values(); //me trae todos los valores de hashmap
         // Creando una ArrayList de valores
        ArrayList<User> listOfValues = new ArrayList<>(valor);
        return listOfValues;
      }

    @Override
    public void add(User user){
        Integer Llave = user.getId(); //la llave del usuario será el id
        userMap.put(Llave, user); //le gregamos un valos al hashmap
    }

    @Override
    public void remove (User user){
        Integer Llave = user.getId();
        userMap.remove(Llave);
    }

    @Override
    public int size() {
        return userMap.size();
    }

    @Override
    public User getUser (int position){
        Collection <User> valor = userMap.values();     
       ArrayList<User> listOfValues = new ArrayList<>(valor);
        return listOfValues.get(position);
    }
 

}
