import java.text.DecimalFormat;
import java.util.Scanner;

public class fp04Formula {
    //Obtener el valor de «c» y «d» de acuerdo a la siguiente fórmula
    public static void main(String[] args) {
        Scanner prop4=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Escribe valor de a");
        int a= prop4.nextInt();

        System.out.println("Escribe valor de b");
        int b= prop4.nextInt();

        double c=((4*Math.pow(a,4))+(3*b*a)+(Math.pow(b,2)))/(Math.pow(a,2)-Math.pow(b,2));
        double d=(((3*Math.pow(c,2))+a+b)/4);

        System.out.println("El valor de c es "+df.format(c));
        System.out.println("El valor de d es "+df.format(d));
    }
}
