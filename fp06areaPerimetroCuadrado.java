import java.text.DecimalFormat;
import java.util.Scanner;

public class fp06areaPerimetroCuadrado {
    //Hallar el área y el perímetro de un cuadrado.
    public static void main(String[] args) {
        Scanner prop6=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Ingresa el ancho o largo");
        int a= prop6.nextInt();

        double area=Math.pow(a,2);
        int perim=a*4;

        System.out.println("El area del cuadrado es "+df.format(area));
        System.out.println("y el perimetro es "+perim);

    }
}
