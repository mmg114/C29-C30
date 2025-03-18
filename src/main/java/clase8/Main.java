package clase8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int contadorWhile = 1;
        while (contadorWhile <= 3){
            System.out.println(contadorWhile);
            contadorWhile++;
        }
        System.out.println("_________________________________________________________");
        int contadorDoWhile = 1;
        do{
            System.out.println(contadorDoWhile);
            contadorDoWhile++;
        }while (contadorDoWhile <= 3);

        System.out.println("_________________________________________________________");
        for (int i=1; i<=3;i++){
            System.out.println("Numero: "+i);
        }
        System.out.println("_________________________________________________________");

        String[] estudiantes = new String[3];

      for (int i = 0; i < estudiantes.length; i++) {
          estudiantes[i] = Math.random()+" ";
      }

        Arrays.stream(estudiantes).forEach(System.out::println);



    }



}
