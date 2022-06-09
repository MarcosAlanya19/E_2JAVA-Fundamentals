import java.text.DecimalFormat;
import java.util.Scanner;

public class fp05porcentajeSuma {
    //Dado 4 números enteros, obtener el porcentaje de cada uno en función a la suma de los 4
    //números ingresados.
    public static void main(String[] args) {
        Scanner prop5=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###");
        System.out.println("Ingrese num1");
        int n1= prop5.nextInt();

        System.out.println("Ingrese num2");
        int n2= prop5.nextInt();

        System.out.println("Ingrese num3");
        int n3= prop5.nextInt();

        System.out.println("Ingrese num4");
        int n4= prop5.nextInt();

        double s=n1+n2+n3+n4;
        double n1p=(n1/s)*100;
        double n2p=(n2/s)*100;
        double n3p=(n3/s)*100;
        double n4p=(n4/s)*100;

        System.out.println("El num1 tiene de porcentaje "+(df.format(n1p))+"%");
        System.out.println("El num2 tiene de porcentaje "+(df.format(n2p))+"%");
        System.out.println("El num3 tiene de porcentaje "+(df.format(n3p))+"%");
        System.out.println("El num4 tiene de porcentaje "+(df.format(n4p))+"%");
        System.out.println("Dando "+df.format(s)+" el 100%");
    }
}
