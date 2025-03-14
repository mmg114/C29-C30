package polimorfismo;

public class Main {

    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal perro = new Perro();

        gato.emitirSonido();
        perro.emitirSonido();
    }
}
