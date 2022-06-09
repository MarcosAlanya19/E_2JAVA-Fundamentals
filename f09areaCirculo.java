import java.text.DecimalFormat;
import java.util.Scanner;

public class f09areaCirculo {
    //Crear un programa para encontrar el área de un círculo, use la fórmula
    public static void useAreaCirculo(){
        Scanner pro9=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Ingresa el radio del circulo");
        double r= pro9.nextDouble();

        double a=Math.PI*Math.pow(r,2);

        System.out.println("El area del ciruclo es "+df.format(a));
    }
    public static boolean useRetry(){
        Scanner retr=new Scanner(System.in);
        System.out.println("\nDesea repetir la operacion ?");
        System.out.println("S / N");
        String response= retr.next();

        return(response.equalsIgnoreCase("s"));
    }
    public static void main(String[] args) {
        boolean retry;
        do {
            f09areaCirculo.useAreaCirculo();
            retry=f09areaCirculo.useRetry();
        }while(retry);
        System.out.println("Fin del proceso");
    }
}
