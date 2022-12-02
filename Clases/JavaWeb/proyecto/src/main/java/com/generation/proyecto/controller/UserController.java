package com.generation.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.generation.proyecto.model.User;
import com.generation.proyecto.service.UserService;

@RestController
public class UserController {
    
    public UserService userService;

    public UserController(@Autowired UserService userService){
        this.userService = userService;
        userService.add(new User(1,"Juan", "Barrias"));
        userService.add(new User(2,"Juanita", "Rodriguez"));
    }

    @GetMapping("/user")
    public User getUser(){

        return userService.getUser(0);
    }


    @GetMapping("/AllUser")
    public List<User> getAllUser(){
        return userService.getAll();
    }

//  localhost:8080/FindUser/1
    @GetMapping("/FindUser/{id}")
    public User FindUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }
    //se instancia el mapping y se crea la url(Path) path y url es lo mismo :D
    @GetMapping("/addUser/{id}/{nombre}/{apellido}")
    //creamos la funcion, para obtener los datos del path se ocupa PathVariable
    //para el pathVariable se le debe entregar el nombre del parametro en la url
    //por ejemplo "id" que en la url está como {id}
    //SE DEBE HACER POR CADA PARÁMTRO ENVIADO EN LA URL
    public void addUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("apellido")String apellido){
        //cuando ya obtenemos todos los parámtros los podemos utilizar dentro de la función
        userService.add(new User(id, nombre, apellido));
    }

    @GetMapping("/removeUser/{id}/{nombre}/{apellido}")
    public void removeUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("apellido")String apellido){
        userService.remove(new User(id, nombre, apellido));
    }

    /*//se instancia el mapping y se crea el url --> Path == url
    //para obtener los datos del path se ocupa @PathVariable
    //Para ocuparlo se debe entregar el nombre del parametro entre {} para que este se modifique despues y no sea estatico
    @GetMapping("/addUser/{id}/{nombre}/{appellido}")
    //aqui se llama la variable segun el nombre que se puso entre {}
    public void addUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("appellido") String appellido){
        userService.add(id,new User(id,nombre,appellido));
    }
 */

    @GetMapping("/countUser")
    public int getSize(){
        return userService.size();
    }
    
}
