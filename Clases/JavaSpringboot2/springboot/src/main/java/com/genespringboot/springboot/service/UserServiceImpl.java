package com.genespringboot.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {
    
     private UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(Integer id){
        Optional <User> users = userRepository.findById(id);
        //el orElse nos permite verificar si hay o no hay datos dentro de nuestra lista.
        //En caso de no haber, va a devolverver el usuario,en caso de no devuelve null
        return users.orElse(null);
    }

    @Override
    public User save (User user){
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id){
        userRepository.deleteById(id);
    }
}

/* 
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
 */
}
