package com.generation.firstproject.models;

//ESTE ES NUESTRA HERENCIA

public class Animales {
  // caracterísiticas de nuestros animales. 
    String nombre; 
    String raza;
    String pelaje;
    Boolean vacunado;

 // viene pensando para que atributos sean para todos los animales que se van a crear (perro, gato)   

 
public String getNombre() {
        return nombre;
    }

    public Animales(String nombre, String raza, String pelaje, Boolean vacunado) {
    this.nombre = nombre;
    this.raza = raza;
    this.pelaje = pelaje;
    this.vacunado = vacunado;
}

    public Animales() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public Boolean getVacunado() {
        return vacunado;
    }

    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }

    //lo que pueden hacer nuestros animales
    public void emitirSonido(){
        System.out.println("Sonido");
    }

    public void desplazarse(){
        System.out.println("moverse de un lugar a otro");
    }

    @Override
    public String toString() {
        return "Animales [nombre=" + nombre + ", raza=" + raza + ", pelaje=" + pelaje + ", vacunado=" + vacunado + "]";
    }
    


}
