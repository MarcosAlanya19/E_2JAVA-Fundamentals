import java.text.DecimalFormat;
import java.util.Scanner;

public class f10segMinHor {
    //Crear un programa que permita convertir una cantidad de segundos en horas, minutos y
    //segundos.
    public static void main(String[] args) {
        Scanner pro10=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Ingrese segundos");
        float seg= pro10.nextInt();

        double min=seg/60;
        double h=min/60;

        System.out.println("En "+df.format(seg)+" segundos");
        System.out.println("son "+df.format(min)+" minutos");
        System.out.println("y "+df.format(h)+" horas");
    }
}
