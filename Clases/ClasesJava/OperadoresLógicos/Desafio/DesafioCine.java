import java.io.Console;
import java.util.concurrent.Executors;

public class DesafioCine {

    /*Parte 2: Descuentos en películas
Una sala de cine hace descuentos de precios dependiendo de la edad del cliente.
La aplicación solicita al usuario que introduzca su edad en la consola de IntelliJ, después de lo cual comprueba si el usuario cumple las condiciones de descuento.
Rango de edad	Precio de la entrada
Billete normal	7 Euros
Por debajo de 5	60% de descuento
Mayores de 60 años	55% Descuento
Escriba la aplicación para que se cumplan las condiciones anteriores y se devuelva el precio correcto del boleto.
Características adicionales
Si ha terminado con la primera parte del ejercicio con tiempo de sobra, agregue la siguiente característica.

Haga que la aplicación indique a los compradores de boletos normales la cantidad de boletos que desean comprar.
Por cada dos o más boletos vendidos, da un 30% de descuento. */

public static void main(String []args){
    Console console = System.console();

System.out.println("*****Bienvenido/a*****");

int edad = Integer.parseInt(console.readLine("ingrese su edad: "));

int entrada = 7; 

if ((edad <= 5) & (edad >=0)){
    System.out.println("El precio de tu entrada es: " + (entrada*0.4) + "euros");
}
else if (edad>60) {
    System.out.println("El precio de tu entrada es: " + (entrada*0.45) + "euros");
}else{
    System.out.println(" El precio de tu entrada es: "+ entrada + "euros"); n
}
}
}
    
