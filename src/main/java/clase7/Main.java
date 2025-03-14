package clase7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();


        if (edad < 18) {
            System.out.println("El edad debe ser mayor de 18");
        } else if (edad >= 18) {
            System.out.println("Bienvenido");
        }

        System.out.println("Ingrese la hora de la reserva 7-11");
        int horaReserva = sc.nextInt();
        switch (horaReserva){
            case 7:
                System.out.println("Reservado. debe llegar 20 min antes de la reserva");
                break;
            case 8:
                System.out.println("Reservado. debe llegar 20 min antes de la reserva");
                break;
            case 9:
                System.out.println("Reservado. debe llegar 20 min antes de la reserva");
                break;
            case 10:
                System.out.println("Reservado. debe llegar 20 min antes de la reserva");
                break;
            default:
                System.out.println("Reservado no valido");
        }


    }
}
