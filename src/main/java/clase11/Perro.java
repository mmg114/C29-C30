package clase11;

public class Perro  implements Animal {


    @Override
    public void haceSonido() {
        System.out.println("Guau");
    }

    @Override
    public void dormir() {
        Animal.super.dormir();
    }
}
