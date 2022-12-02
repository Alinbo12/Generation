package com.generation.firstproject.models;
 
// vamos a llamar a herencia "Animales". Con extends decimos que gato hereda de animales
public class Gato extends Animales {

    Integer bigotes;

   //generamos constructor
    public Gato() {
        super(); //nos permite obtener lo que trae gato de la clase madre. LLama a la herencia. Creamos gato vacío con datos de animales vacios
        
    }
      

public Gato(Integer bigotes) {
        this.bigotes = bigotes;
    }


public Gato(String nombre, String raza, String pelaje, Boolean vacunado, Integer bigotes) {
    super(nombre, raza, pelaje, vacunado);
    this.bigotes = bigotes;
}

    public Integer getBigotes() {
        return bigotes;
    }

    public void setBigotes(Integer bigotes) {
        this.bigotes = bigotes;
    }

}