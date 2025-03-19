package clase9;

import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        List<String> nombres = List.of("Mauricio","pedro","Juan","Maria","Carlos");

      //  nombres.stream().filter(name->name.toUpperCase().startsWith("M")).forEach(System.out::println);
         List<String> nombresOrdenados= nombres.stream().sorted().toList();


       //  nombresOrdenados.forEach(System.out::println);

        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);

        int suma=numeros.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .reduce(0, Integer::sum);

        System.out.println(suma);
    }
}
