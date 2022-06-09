import java.util.Scanner;

public class fp09areaPerimetroRectangulo {
    //Hallar el área y el perímetro de un rectángulo.
    public static void main(String[] args) {
        Scanner prop9=new Scanner(System.in);
        System.out.println("Ingresar alto del rectangulo");
        int h= prop9.nextInt();

        System.out.println("Ingresar ancho del rectangulo");
        int a= prop9.nextInt();

        int area=a*h;
        int perim=2*(a+h);

        System.out.println("El area del rectagunlo es "+area);
        System.out.println("El perimetro del rectangulo es "+perim);
    }
}
