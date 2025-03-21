package claseFinal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
     //   Date fecha = new Date();
      //  System.out.println(fecha);

     //   Calendar cal = Calendar.getInstance();
     //   System.out.println(cal.get(Calendar.DAY_OF_WEEK));

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        //System.out.println(localDate);
        //System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        //System.out.println(localDateTime);

        LocalDate fechaParticular = LocalDate.of(1992,9,29);
        //System.out.println(fechaParticular);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(formatter));

        int dia = localDate.getDayOfMonth();
        int mes = localDate.getMonthValue();
        int anio = localDate.getYear();

        //System.out.println("Año "+ anio +" dia de "+dia+" mes "+mes);

      //  LocalDate FechaAgregada = localDate.plusDays(15);
        LocalDate FechaAgregada = localDate.minusYears(15);
        System.out.println(FechaAgregada);

        if (FechaAgregada.isAfter(localDate)){
            System.out.println("La fecha de agregada es mayor que la actual");
        }else{
            System.out.println("La fecha de agregada es Menor que la actual");
        }


    }
}
