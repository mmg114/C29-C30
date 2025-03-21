package clase11;

public enum DiaSemana
{
    LUNES(true),MARTES(true),MIERCOLES(true),SABADO(false),DOMINGO(false);

    private boolean esLaboral;

    DiaSemana(boolean esLaboral){
        this.esLaboral = esLaboral;
    }

    public boolean isLaboral(){
        return esLaboral;
    }
}
