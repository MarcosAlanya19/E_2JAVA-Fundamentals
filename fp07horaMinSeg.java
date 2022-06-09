import java.text.DecimalFormat;
import java.util.Scanner;

public class fp07horaMinSeg {
    //Dada una cantidad de horas, obtener su equivalente en minutos y segundos.
    public static void main(String[] args) {
        Scanner prop7=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Ingresar cantidad de horas");
        double h= prop7.nextDouble();

        double min=h*60;
        double seg=min*60;

        System.out.println("En "+df.format(h)+" horas");
        System.out.println("Hay "+df.format(min)+" minutos");
        System.out.println("y "+df.format(seg)+" segundos");
    }
}
