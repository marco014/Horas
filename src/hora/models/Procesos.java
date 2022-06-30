package hora.models;

public class Procesos {
    private int hora;
    private int min;
    private int seg;
    public boolean validarDatos(int hora, int min, int seg){
        if (hora >= 0  && hora < 24 && min >= 0 && min < 60 && seg >= 0 && seg < 60){
            return true;
        }else {
            return false;
        }
    }
    public Procesos() {
    }
}
