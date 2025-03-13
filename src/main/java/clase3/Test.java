package clase3;

public class Test {

    public static void main(String[] args) {

       Botella botella3 = new Botella("Gaseosa",1.8F,1000, "Recta","transparente","888858","1111111151");

        System.out.println(botella3.getNombre());
        System.out.println(botella3.getColor());

        System.out.println(botella3.getContenido());
        botella3.setContenido(1100);
        System.out.println(botella3.getContenido());

    }
}
