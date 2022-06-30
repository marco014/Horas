package hora.models;

import java.util.Scanner;

public class LecturaDatos {
    public int hora, min, seg;
    public void lecturaDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese hora: ");
        hora = entrada.nextInt();
        System.out.println("Ingrese minutos: ");
        min = entrada.nextInt();
        System.out.println("Ingrese segundos: ");
        seg = entrada.nextInt();
    }
    public LecturaDatos() {}
    public int getHora() {
        return hora;
    }
    public int getMin() {
        return min;
    }
    public int getSeg() {
        return seg;
    }
}
