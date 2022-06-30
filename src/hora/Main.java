package hora;

import hora.models.Impresion;
import hora.models.LecturaDatos;
import hora.models.Procesos;

public class Main {
    public static void main(String[] args) {
        LecturaDatos lecturaDatos = new LecturaDatos();
        lecturaDatos.lecturaDatos();
        Procesos validarDatos = new Procesos();
        Impresion imprimir = new Impresion();
        imprimir.imprimir(validarDatos.validarDatos(lecturaDatos.getHora(), lecturaDatos.getMin(), lecturaDatos.getSeg()));
    }
}
