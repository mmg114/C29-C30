package clase8;

import java.util.Scanner;
import java.util.logging.Logger;

public class MainEjercicios {

    private static final Logger logger = Logger.getLogger(MainEjercicios.class.getName());

    public static void main(String[] args) {
        int res = 20/0;
        var suma=0;
        for (int i = 0; i <= 100; i++) {
            suma = suma+i;
        }
        System.out.println(suma);

        System.out.println("_______________________________________________________");

           Scanner scanner = new Scanner(System.in);
           int numero;
           int acum = 0;
           do {
               try{
                   System.out.print("Ingresa un número (0 para terminar): ");
                   numero = scanner.nextInt();
                   acum += numero;
               }catch (java.util.InputMismatchException e){
                   System.out.println("ERROR DEBE PONER SOLO NUMEROS EJEMPLO...1,2,3,4...");
                   scanner.next();
                   numero =-1;
               }catch (RuntimeException e){
                   System.out.println("ERROR Desconocido contacte con el servidor...");
                   scanner.next();
                   numero =-1;
               }
           } while (numero != 0);
           System.out.println("La suma total es: " + acum);


        System.out.println("La aplicacion no se bloqueo");


    }

}
