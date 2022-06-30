package hora.models;

public class Impresion {
    public Impresion(){
    }
    public void imprimir( boolean v){
        if (v){
            System.out.println("Hora valida");
        } else {
            System.out.println("Hora invalida");
        }
    }
}
