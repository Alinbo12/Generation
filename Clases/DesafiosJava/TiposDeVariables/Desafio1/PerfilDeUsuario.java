import java.io.Console;

public class PerfilDeUsuario {
    public static void main(String []args){
        Console console = System.console();

    String nombreUsuario = console.readLine("Inserte su nombre: ");
    String edad = console.readLine("Edad: ");
    int edadUsuario = Integer.parseInt(edad); // convertir variable edad a edadUsuario para que sea int
    int anioActual = 2022;
    int anioNacimiento = 2022 - edadUsuario; // para determinar año de nacimiento
    String género = console.readLine("Con qué género se identifica: ");
    String preferenciaLaboral = console.readLine("Inserte preferencia laboral: ");
    String Nacionalidad = console.readLine("Nacionalidad: ");
    String TipodeSangre = console.readLine("Tipo de Sangre: ");

    System.out.print = ("Tu nombre es: " + nombreUsuario);
    System.out.print = ("edad: "+ edad + "años.");
    System.out.print = ("Año de nacimiento: " + anioNacimiento); 




    }
}

/* Cree una clase titulada "Perfil de usuario" crear funcion main
Escriba el código para que la aplicación almacene:
 el nombre, la edad, el género, la preferencia laboral, la nacionalidad y el tipo de sangre de los usuarios.
Piense en los nombres de variables que desea asignar a las 
propiedades anteriores y las convenciones de nombres de variables que se deben seguir.
Utilice la edad para calcular el año en que nació un usuario.
Imprima los valores en la consola de un usuario.
 */