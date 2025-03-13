package clase5;

public class Vehiculo {
    private String marca;
    public Vehiculo() {

    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void arrancar() {
        System.out.println("El vehículo de marca " + marca + " está arrancando.");
    }

    public String getMarca() {
        return marca;
    }
}
