package clase11;

public class Main {

    public static void main(String[] args) {
       DiaSemana hoy = DiaSemana.MARTES;
        System.out.println(hoy.isLaboral() ? "Es laboral" : "No es laboral");
    }
}
