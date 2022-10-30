import java.io.Console;

public class Main {   // ejecutable de Java, le da todo para empezar. 
   public static void main(String []args){ // método, es muy parecedio a una función en JS. Es necesario tenerlo para escrbiri otras funcionalidades Ej: System

    System.out.println ("estamos imprimiendo, este es un mensaje en consola ");  // para mostrar en consola
    //si coloco println es con salto de línea
    System.out.print ("este es un mensaje en consola con salto de linea ");
    //para pedirle información al usuario se ocupa lo siguiente:
      System.out.print ("-------------------------------------");
    Console console = System.console();
    // console.readLine(); // llamamos al console de arriba. Me permite ingresas cosas, escribir. Si escribimos dentro
                        // del paréntesis, son permite dar una instrucción


      String nombre = console.readLine("inserte nombre:");
      System.out.println ("este es el nombre: " +nombre);
      String num = console.readLine("inserte número: ");
      int nuevoNum = Integer.parseInt(num);
      System.out.println("el número es: "+ nuevoNum);

      //vamos a pedir 2 números al usuario para que se sumen

      String nume = console.readLine("inserte número 1: ");
      int nuevoNum1 = Integer.parseInt(nume);
      String num2 = console.readLine("inserte número 2: ");
      int nuevoNum2 = Integer.parseInt(num2);
      
      int suma = nuevoNum1 + nuevoNum2; 
      System.out.println("la suma es: "+ suma);

      


   }
      
}


