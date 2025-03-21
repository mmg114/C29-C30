package clase11;

public class Gato implements Animal {


    @Override
    public void haceSonido() {
        System.out.println("Miauuu");
    }

    @Override
    public void dormir() {
        Animal.super.dormir();
    }
}
