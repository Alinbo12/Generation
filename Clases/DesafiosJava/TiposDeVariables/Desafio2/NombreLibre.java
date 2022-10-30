/*
 * Cree un proyecto nombre libre pista Vamos a encontrar el área y el perímetro de un círculo.
Escriba una aplicación Java que solicite al usuario que ingrese el diámetro de un círculo y calcule el área y el perímetro del círculo.
Realice una operación de conversión ampliada (de entero a doble) al almacenar el resultado de las operaciones.
Imprime los resultados de las dos operaciones en la consola.
 */

import java.io.Console;

public class NombreLibre {
    public static void main(String []args){
    Console console = System.console();
    
    String diámetro = console.readLine("Ingrese diámetro: "); //pedimos a usuario ingresar diámetro
    
    Double radio = ((Double.parseDouble (diámetro) / 2)); // fórmula para calcular radio

    Double perimetro = (Math.PI*2*radio);

    System.out.println("Su perímetro es: " + perimetro);
    System.out.println("Su área es: "+ area);
    


    }
}


/* import java.io.Console;

public class calculo_circulo {
    public static void main(String [] args){
        
    Console console = System.console();

    String diametro_str = console.readLine("Inserte el diametro del circulo: ");
    Double radio_dou = ((Double.parseDouble(diametro_str)/2));

    Double perimetro = radio_dou * 3.14 * 2;
    Double area = (radio_dou * radio_dou) * 3.14;

    System.out.println("Su perimetro es: " + perimetro);
    System.out.println("Su area es: " + area);


    }
}
 */