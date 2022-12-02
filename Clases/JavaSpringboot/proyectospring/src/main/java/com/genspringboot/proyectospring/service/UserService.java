package com.genspringboot.proyectospring.service;

import com.genspringboot.proyectospring.model.User;

public interface UserService {
    
    User getUser(Integer id);

    User save (User user);

    void delete(Integer id);
}
