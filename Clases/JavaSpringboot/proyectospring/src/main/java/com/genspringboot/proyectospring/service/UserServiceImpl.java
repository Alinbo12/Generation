package com.genspringboot.proyectospring.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.genspringboot.proyectospring.model.User;
import com.genspringboot.proyectospring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    //esto verifica que la conexion a la base de datos está correcta
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
}

@Override
    public User getUser(Integer id){
        //select * from user where id = id;
        Optional <User> users = userRepository.findById(id);
        // el orElse nos permite verificar si hay o no hay datos dentro de nuestra lista
        //en caso de haber, va a devolver el usuario, en caso de que no, devuelve un null
        return users.orElse(null);
    }

    @Override
    public User save(User user){
        // insert into user (columnas)(values);
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id){
        //delete from user where id = id;
        userRepository.deleteById(id);
        
    }

}