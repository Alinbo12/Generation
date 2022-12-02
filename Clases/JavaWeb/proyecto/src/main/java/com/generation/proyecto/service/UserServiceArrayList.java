package com.generation.proyecto.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.generation.proyecto.model.User;

@Service //avisamos que esto será un servicio.
// vamos a implementar el service
public class UserServiceArrayList implements UserService { //acá crearemos los servicios.

   //atributo para crear interfaz 
    private List <User> userList = new ArrayList <>();
    
   //constructor vacío 
   public UserServiceArrayList (){

   }
   
   //sobreescribimos nuestro getAll
    @Override //avisa a Java que lo que está acá está sobre escrito desde la interfaz.
    public List<User> getAll() {
        return userList;
    }

    @Override
    public void add(User user) { //nos dejará ingresar un dato en nuestra lista
        userList.add(user);
    }

    @Override
    public void remove (User user){
        userList.remove(user);

    }

    @Override
    public int size (){
        return userList.size();
    }

    @Override
    public User getUser(int position){
        return userList.get(position);
    }
}

