package com.genespringboot.springboot.service;

import org.apache.catalina.User;


public interface UserService {
    
    User getUser (Integer id);

    User save (User user);

    void delete (Integer ig);
}
