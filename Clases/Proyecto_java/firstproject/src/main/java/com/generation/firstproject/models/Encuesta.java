package com.generation.firstproject.models;

public class Encuesta {
   private String nombre;
   private String nacionalidad;
   private int edad;
   private Boolean vota;

     public Encuesta() {
    }
  

    public Encuesta(String nombre, String nacionalidad, int edad, Boolean vota) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.vota = vota;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }


    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Boolean getVota() {
        return vota;
    }


    public void setVota(Boolean vota) {
        this.vota = vota;
    }


    String llamar(String contacto){
        if (contacto == "contesta"){
            return "realizar la primera pregunta";
        }
        return "llamada no conectada";
    }

    void primeraPregunta (Boolean vota){
        if (vota == true){
            System.out.println("pasa a la siguiente pregunta");
        }else{
            System.out.println("agradecer y cortar");
        }
    }


    public void setVota(String string) {
    }


    @Override
    public String toString() {
        return "Encuesta [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", vota=" + vota
                + "]";
    }

    
}


