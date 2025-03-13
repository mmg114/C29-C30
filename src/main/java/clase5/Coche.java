package clase5;

class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String marca, int numPuertas) {
        super(marca); // Llama al constructor de la superclase
        this.numPuertas = numPuertas;
    }

    public void abrirPuertas() {
        System.out.println("Abriendo las " + numPuertas + " puertas del coche.");
    }
}