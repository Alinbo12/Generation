package com.generation.firstproject.models;

public class Perro {
    private String nombre; //primer atributo del perro
    private String pelaje; // otra característica
    private Boolean vacunado;
    public Object adopcion;

// cómo construir el perro? -> constructores

// por defecto:

public Perro() { // buena práctic, tener constructor por defecto
}

//publico o privado; nombre de la clase que va a construir; qué cosas
   
    public Perro(String nombre, String pelaje, Boolean vacunado) {
    this.nombre = nombre;
    this.pelaje = pelaje;
    this.vacunado = vacunado; // estas no son funciones como las conocemos, es un constructor
}

    // con esto yo ingreso y obtengo el nombre de mi perro
    public String getNombre() {
        return nombre;
    }
    // con esto MODIFICO el nombre del perro
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void ladrar(){ //no me retorna nada
        System.out.println("guau"); // acciones que hace perro
    }

    public String truco(String tipoTruco){
        if (tipoTruco == "da la pata"){
            return "doy la pata";  // estamos suponiendo que solo sabe dar la pata
        }

       return  "no hace nada";   // no lo hace porque no sabe nada más
    }


    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", pelaje=" + pelaje + ", vacunado=" + vacunado + "]";
    }

    public Object adopcion() {
        return null;
    }

    
}
