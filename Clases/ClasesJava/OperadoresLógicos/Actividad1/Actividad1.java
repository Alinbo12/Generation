/*Escriba un programa donde el usuario ingrese una calificación de un estudiante
 y el programa devuelva una nota basada en las siguientes condiciones:
Suspendió si obtuvo una nota igual o inferior a 3.
Insuficiente si tuvo mayor a 3 pero menos que 5 (inclusive)
Bueno si obtuvo una nota mayor a 5 pero menor a 8 (inclusive)
Excelente si consiguió un 10
Debe avisar si se ingresa un número fuera del rango (0 a 10) */

import java.io.Console;
public class Actividad1 {
    public static void main(String[] args) {

Console console =System.console();

int nota = Integer.parseInt(console.readLine("Ingresa la nota: "));
        
        if((nota == 10) | (nota == 9)) {
            System.out.println("Excelente");
        }
        else if ((nota > 5) & (nota <=8)) { 
             System.out.println("Bueno");
        } else if ((nota > 3) & (nota <=5)) {
             System.out.println("Insuficiente"); 
        }else if ((nota <= 3) & (nota >= 0)) {
            System.out.println("Suspendió"); 
        }else{
            System.out.println("Número fuera de rango, debe ingresar un número entre 0 y 10");
        }
    }
}
