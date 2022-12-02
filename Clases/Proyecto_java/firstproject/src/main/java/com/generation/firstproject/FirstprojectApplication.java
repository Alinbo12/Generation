package com.generation.firstproject;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.firstproject.models.Encuesta;
import com.generation.firstproject.models.Gato;
import com.generation.firstproject.models.Perro;

@SpringBootApplication
public class FirstprojectApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // nos permite hacer funcionar todo
		// SpringApplication.run(FirstprojectApplication.class, args); -> aun no la usaremos

		Perro perroDefault = new Perro(); // estamos creando un perro con el constructor por defecto
		Perro perroCompleto = new Perro("Max", "rulos", true);

		perroDefault.setNombre("chau-chau");
		perroDefault.setPelaje("pelo soave");
		perroDefault.setVacunado(true);

		System.out.println(perroDefault.getNombre());
		System.out.println(perroCompleto.getPelaje());
/* 
		System.out.println("Perro por Default: " + perroDefault.toString()); //invocar método to string de perro
		System.out.println("perro complet: "+ perroCompleto.toString());

		perroDefault.ladrar();
		System.out.println(perroCompleto.truco("doy la pata"));
 */


		Encuesta encuestaPrueba = new Encuesta(); // creación de objetio vacíp
		Encuesta contestada = new Encuesta("Marce", "Brasil", 45, true); 
			//creación de objetivo completo con sus valores


		System.out.println(contestada.getNacionalidad());
		encuestaPrueba.setNombre("Constantino"); // lleno datos de objeto vacío con método set
		encuestaPrueba.setEdad(35);
		encuestaPrueba.setNacionalidad("mexico");
		encuestaPrueba.setVota(true);

		System.out.println(contestada.getEdad()); 
		int edad_encuesta = contestada.getEdad();
		String nacionalidad = contestada.getNacionalidad();
		


		System.out.println(encuestaPrueba.toString());

		System.out.println(encuestaPrueba.getEdad());

		encuestaPrueba.setEdad(26);
		encuestaPrueba.setNacionalidad("argentina");

		System.out.println(encuestaPrueba.toString());

System.out.println("***********************************************************************");
	
// llama a consola para poder preguntar cosas a usuario
	Console console = System.console();
	
	//se solicita la cantidad de objetos (encuestas) a crear.
	int cantidad = Integer.parseInt(console.readLine("ingrese la cantidad de encuestas que quiere crear: ")); 
	Encuesta listaEncuesta = new Encuesta(); 
	
	// se crea una arraylist para generar las encuestas.	
	ArrayList <Encuesta> datosEncuesta = new ArrayList<Encuesta>();	

	//bucle para generar la cantidad de listas de encuestas.
	for (int i = 0; i < cantidad; i++ ){ 
		//encuesta que me permite generar las otras encuestas. Encuesta por default
		Encuesta lista = new Encuesta(); 
		lista.setNombre(console.readLine("Ingrese nombre: "));
		lista.setNacionalidad(console.readLine("Ingrese nacionalidad: "));
		lista.setEdad(Integer.parseInt(console.readLine("Ingrese edad: ")));
			
		// para que se transforme buleano en 1 o 2, ya que no pondrá true o false.
		int vota = Integer.parseInt(console.readLine("Ingrese 1 si vota o 2 si no vota."));
		while (vota > 2 || vota < 1){
		vota = Integer.parseInt(console.readLine("No ingresaste número válido. Ingrese 1 si vota o 2 si no vota. "));
		}
			if (vota == 1){
			lista.setVota(true); 
			}else if (vota == 2){
			lista.setVota(false);
		}
	
	datosEncuesta.add(lista); //se agrega a la lista. Debería dar un arraylist con objetos ingresados.
	}	
		System.out.println(datosEncuesta);


	System.out.println("***********************************************************************");	

	// vamos a crear un gato, llamandolo de la herencia

	Gato gato = new Gato();

	gato.desplazarse(); //logré hacer que se desplazara
	
	}



}
			

		/* for (int x = 0; x < datosEncuesta.size(); x++ ){
		listaEncuesta.setNombre(console.readLine("ingrese nombre: "));
		listaEncuesta.setNacionalidad(console.readLine("ingrese nacionalidad: "));
		} */
	
