package com.security.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.security.model.Authority;
import com.security.security.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {
        //buscar el usuario con el repository, y si no existe vamos a lanzar una excepción.
        //Nosotros generamos la excepeción (creamos un error)
        //guardamos en una variable el usuario buscado según username, si no lo encuentro creamos un error, el cual
        //al momeno de generarse nos devolverá el mensaje "no existe el usuario".
        com.security.security.model.User appUser = 
        userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException(("no existe el usuario")));
        
        //Vamos a mapear nuestra lista de authority con las propiedades de spring security
        List gantList = new ArrayList();

        for(Authority authority : appUser.getAuthority()) {
            //itera rol_usuario, rol_cliente.. hasta encontrar el rol de authority
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
            gantList.add(grantedAuthority);
        }

        //creamos objeto de UserDetails que va a ir en sesión y también nos lo va a retornar.

        UserDetails user = (UserDetails) new User (appUser.getUsername(), appUser.getPassword(), gantList);
        return user;
    }

}
