package clase3;

public class Botella {

    public Botella() {

    }

    public Botella(String nombre, float altura, int contenido, String estilo, String color, String id, String codigoDeBarras) {
        this.nombre = nombre;
        this.altura = altura;
        this.contenido = contenido;
        this.estilo = estilo;
        this.color = color;
        this.id = id;
        this.codigoDeBarras = codigoDeBarras;
    }

    private String nombre;
    private float altura;
    private int contenido;
    private String estilo;
    private String color;
    private String id;
    private String codigoDeBarras;


    public String hidratar(){
        return "hidratando con botella de " + nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public float getAltura() {
        return altura;
    }

    public int getContenido() {
        return contenido;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
    public void setContenido(int contenido) {
        this.contenido =  contenido;
    }
}
