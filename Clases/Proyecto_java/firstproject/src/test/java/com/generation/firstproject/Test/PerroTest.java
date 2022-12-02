package com.generation.firstproject.Test;

import static org.junit.jupiter.api.Assertions.*; //permite funcionalidades

import org.junit.jupiter.api.Test; // ok, ocuparemos funcionalidades de api, los test que no trae la libreria

import com.generation.firstproject.models.Perro;


//se elimina public porque no debe ser público el test, solo es para mi
  class PerroTest {
   /* @Test //desde ahora esto es un test

//declaro función para mi test
    void testAdopcion()  {
       //objeto para testear
        Perro perro = new Perro(); 
        //comparo mi resultado esperado con la función a responder, esto se hace con assertEquals
        assertEquals(false, perro.adopcion()); 

 */

    
@Test
void testTruco(){
    Perro perro = new Perro();

    assertEquals("doy la pata", perro.truco("da la pata"));
}
}



